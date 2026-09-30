class Node {
    int key;
    Node next;

    Node(int key) {
        this.key = key;
        this.next = null;
    }
}

class MyHashSet {

    Node[] buckets;

    public MyHashSet() {
        buckets = new Node[1000];

        // Every bucket gets a dummy node
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new Node(0);
        }
    }

    public void add(int key) {
        int index = key % buckets.length;

        Node current = buckets[index];

        while (current.next != null) {
            if (current.next.key == key) {
                return;
            }

            current = current.next;
        }

        current.next = new Node(key);
    }

    public void remove(int key) {
        int index = key % buckets.length;

        Node current = buckets[index];

        while (current.next != null) {
            if (current.next.key == key) {
                current.next = current.next.next;
                return;
            }

            current = current.next;
        }
    }

    public boolean contains(int key) {
        int index = key % buckets.length;

        Node current = buckets[index];

        while (current.next != null) {
            if (current.next.key == key) {
                return true;
            }

            current = current.next;
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