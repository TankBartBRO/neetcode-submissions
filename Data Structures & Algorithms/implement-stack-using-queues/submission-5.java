class MyStack {
    Queue <Integer> q1=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q1.offer(x);
        int ele=q1.size()-1;
        for(int i=0;i<ele;i++){
            q1.offer(q1.poll());
        }
    }
    
    public int pop() {
        int ans=q1.poll();
        return ans;
        //return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */