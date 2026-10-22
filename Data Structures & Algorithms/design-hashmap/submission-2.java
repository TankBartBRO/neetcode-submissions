class Node{
    int key,value;
    Node next;
    Node(int key, int value){
        this.key=key;
        this.value=value;
        this.next=null;
    }
}
class MyHashMap {
        Node [] buckets;
    public MyHashMap() {
        buckets=new Node[1000];
        for(int i=0;i<buckets.length;i++){
            buckets[i]=new Node(-1,-1);
        }
    }
    
    public void put(int key, int value) {
        int index=key%buckets.length;
        Node curr=buckets[index];
        while(curr.next!=null){
            if(curr.next.key==key){
                curr.next.value=value;
                return;
            }
            curr=curr.next;
        }

        curr.next = new Node(key, value);
    }
    
    public int get(int key) {
        int index=key%buckets.length;
        Node curr=buckets[index];
        while(curr.next!=null){
            if(curr.next.key==key){
                return curr.next.value;
        }
        curr=curr.next;
    }
    return -1;
    }
    
    public void remove(int key) {
        int index=key%buckets.length;
        Node curr=buckets[index];
        while(curr.next!=null) {
            if (curr.next.key==key) {
                curr.next=curr.next.next;
                return;
            }
            curr=curr.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */