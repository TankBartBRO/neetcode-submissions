class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        if(set.size()==0){
            return 0;
        }
        int maxLen=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int count=1;
                int x=num;
        
            while(set.contains(x+1)){
                x=x+1;
                count++;
            }
            maxLen=Math.max(maxLen,count);
            }
        }
    return maxLen;
    }
}
