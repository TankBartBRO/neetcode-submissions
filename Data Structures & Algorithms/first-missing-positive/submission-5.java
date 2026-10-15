class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i]>=1 && nums[i]<=n && nums[i]!=nums[nums[i]-1]){
                int pos=nums[i]-1;
                int tmp=nums[i];
                nums[i]=nums[pos];
                nums[pos]=tmp;
            }else{
                i++;
            }
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
    }
}