class MinStack {
    private Stack<long[]> stk;
    public MinStack() {
        stk=new Stack<>();
    }
    
    public void push(int val) {
        if(stk.isEmpty()){
            stk.push(new long[]{val,val});
        }else{
            long curr=stk.peek()[1];
            stk.push(new long[]{val, Math.min(val,curr)});
        }
    }
    public void pop() {
        if(!stk.isEmpty()){
            stk.pop();
        }
    }
    
    public int top() {
        return (int)stk.peek()[0];
    }
    
    public int getMin() {
        return (int) stk.peek()[1];
    }
}
