class Node{
    int key;
    Node next;
    Node(int key){
        this.key=key;
        this.next=null;
    }
}
class MyHashSet {
    Node [] buckets;
    public MyHashSet() {
        buckets=new Node[1000];
    }
    
    public void add(int key) {
        int index=key%1000;
        if(buckets[index]==null){
            buckets[index]=new Node(key);
        }else{
            Node current=buckets[index];
            Node prev=null;
            while(current!=null){
                if(current.key==key){
                    return;
                }
                prev=current;
                current=current.next;
        }
        prev.next=new Node(key);
        }
    }
    
    public void remove(int key) {
        int index=key%1000;
        Node dummy=new Node(-1);
        dummy.next=buckets[index];
        Node prev=dummy;
        Node current=dummy.next;
        while(current!=null){
            if(current.key==key){
                prev.next=current.next;
                buckets[index]=dummy.next;
                return;
            }
            prev=current;
            current=current.next;
        }


    }
    
    public boolean contains(int key) {
        int index=key%1000;
        Node current=buckets[index];
        while(current!=null){
            if(current.key==key){
                return true;
            }
            current=current.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */