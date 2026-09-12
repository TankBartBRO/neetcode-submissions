class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>>map=new HashMap<>();
        for(String s:strs){
            int count[]=new int[26];
            for(char c:s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<26;i++){
                sb.append(count[i]).append('#');
            }
            String key=sb.toString();
            if(map.containsKey(key)){
                map.get(key).add(s);
            }else{
                ArrayList<String> list=new ArrayList<>();
                list.add(s);
                map.put(key,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
