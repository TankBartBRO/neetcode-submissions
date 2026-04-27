class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums) {
            set.add(num); 
        }
        int longest=0;
        for(int num:nums){
            int curr=num;
            int l=1;
            while(set.contains(curr-1)){
                curr--;
                l++;
            }
            longest=Math.max(longest,l);
        }
        return longest;
    }
}

