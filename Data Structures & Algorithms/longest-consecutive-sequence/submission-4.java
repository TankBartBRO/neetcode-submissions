class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int smallest=Integer.MAX_VALUE;
        int count=0;
        int longest=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==smallest){
                smallest=nums[i];
                count+=1;
            }else if(nums[i]!=smallest){
                smallest=nums[i];
                count=1;
            }
            longest=Math.max(count,longest);
        }
        return longest;
    }
}
