class Node{
    int key;
    int value;
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
    }
    public void put(int key, int value) {
        int index=key%buckets.length;
        Node curr=buckets[index];
        Node prev=null;
        if(curr==null){
            buckets[index]=new Node(key,value);
            return;
        }
        //else
        while(curr!=null){

            if(curr.key==key){
                curr.value=value;
                return;
            }
            prev=curr;
            curr=curr.next;
        }
        prev.next=new Node(key,value);
    }
    public int get(int key) {
        int index=key%buckets.length;
        Node curr=buckets[index];
        while(curr!=null){
            if(curr.key==key){
                return curr.value;
            }
            curr=curr.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        int index=key%buckets.length;
        Node dummy=new Node(-1,-1);
        dummy.next=buckets[index];
        Node prev=dummy;
        Node curr=dummy.next;
        while(curr!=null){
            if(curr.key==key){
                prev.next=curr.next;
                buckets[index]=dummy.next;
            }
            prev=curr;
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