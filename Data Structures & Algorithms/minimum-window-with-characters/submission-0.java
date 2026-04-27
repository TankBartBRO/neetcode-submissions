class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()){
            return "";
        }
        HashMap<Character, Integer> map1=new HashMap<>();
        HashMap<Character, Integer> win=new HashMap<>();
        for(char c:t.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        int l=0, r=0, have=0, need=map1.size();
        int n=s.length();
        int [] res={-1,-1};
        int startLen=Integer.MAX_VALUE;
        while(r<n){
            char c1=s.charAt(r);
            win.put(c1,win.getOrDefault(c1,0)+1);
            if(map1.containsKey(c1) && win.get(c1).equals(map1.get(c1))){
                have++;
            }
            while(have==need){
                if(r-l+1<startLen){
                    startLen=r-l+1;
                    res[0]=l;
                    res[1]=r;
                }
                char c2=s.charAt(l);
                win.put(c2,win.getOrDefault(c2,0)-1);
                if(map1.containsKey(c2) && win.get(c2)<(map1.get(c2))){
                have--;
            }
            l++;
            }
            r++;
        }
        return startLen==Integer.MAX_VALUE?"":s.substring(res[0], res[1]+1);
    }
}
