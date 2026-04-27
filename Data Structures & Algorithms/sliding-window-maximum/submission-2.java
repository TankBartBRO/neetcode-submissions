class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer>list=new ArrayList<>();
        int n=nums.length;
        int l=0;
        int r=k-1;
        while(r<n){
            int max=nums[l];
            for(int i=l+1; i<=r; i++) {
                max=Math.max(max,nums[i]);
            }
            list.add(max);
            l++;
            r++;
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}

