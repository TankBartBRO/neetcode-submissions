class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap=new PriorityQueue<>((a,b)->(a.getValue()-b.getValue()));
            for(Map.Entry<Integer, Integer>entry:map.entrySet()){
                minHeap.add(entry);
                if(minHeap.size()>k){
                    minHeap.poll();
                }
            }   
            int res[]=new int[k];
            for(int i=0;i<k;i++){
                res[i]=minHeap.poll().getKey();
            } 
        return res;       
    }
}
