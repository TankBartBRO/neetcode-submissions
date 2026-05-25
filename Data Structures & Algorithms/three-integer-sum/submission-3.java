class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>res=new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
        HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int k=-(nums[i]+nums[j]);
                    if (set.contains(k)){
                        List<Integer> ans= new ArrayList<>();
                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(k);
                        Collections.sort(ans);
                        res.add(ans);
                    }
                        set.add(nums[j]);
                }
        }
                return new ArrayList<>(res);
    }
}
