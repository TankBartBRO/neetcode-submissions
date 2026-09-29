class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int maxLen=0;
        int count=0;
        for(int i:set){
            if(!set.contains(i-1)){
                int x=i;
                count=1;
                while(set.contains(x+1)){
                    x=x+1;
                    count++;
                }
            }
            maxLen=Math.max(maxLen,count);
        }
        return maxLen;
    }
}
