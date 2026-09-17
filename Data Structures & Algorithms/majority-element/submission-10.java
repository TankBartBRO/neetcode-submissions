class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int cand=nums[0];
        for(int i:nums){
            if(count==0){
                cand=i;
                count=1;
            }else if(i!=cand){
                count--;
            }else{
                count++;
            }
        }
        return cand;
    }
}