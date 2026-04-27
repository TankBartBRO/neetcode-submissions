class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        int l=0;
        int r=k-1;
        while(r<n) {
        int max=nums[l];
        int i =l+1;
            while(i<=r) {
                if (nums[i]>max) {
                max=nums[i];
                }
            i++;
            }
        list.add(max);
        l++;
        r++;
        }
        int[] res=new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        res[i]=list.get(i);
        }
        return res;
    }
}
