class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq=new HashMap<>();
        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        //freq = {1=1, 2=2, 3=3}
        //Comparison freq ke basis par karna.Iske liye Java mein hum PriorityQueue ke saath Comparator denge
        //elements stored cuz we have to return elements at last
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap=new PriorityQueue<>((a,b) -> a.getValue()-b.getValue());//PQ excepts one TYPE only like Integer but we need to keep ele+freq(1-1) is 1 pair so entry represents this that's why we use Map.Entry
    for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
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
