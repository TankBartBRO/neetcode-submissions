class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0;
        int n=s.length();
        int max=0;
        Set<Character> hash=new HashSet<>();
        while(r<n){
            if(!hash.contains(s.charAt(r))){
                hash.add(s.charAt(r));
                r++;
                max=Math.max(max,hash.size());
            }else{
            hash.remove(s.charAt(l));
            l++;
            }
        }
        return max;
    }
}
