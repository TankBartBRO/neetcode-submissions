class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq=new HashMap<>();
        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap=new PriorityQueue<>((a,b) -> a.getValue()-b.getValue());
           for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            minHeap.add(entry);
                if(minHeap.size()>k){
                    minHeap.poll();
                }
           }
           int [] res=new int[k];
           for(int i=0;i<k;i++){
            res[i]=minHeap.poll().getKey();
           }
           return res;
    }
}
