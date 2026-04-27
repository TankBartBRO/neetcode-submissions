class MinStack {
    private Stack<Long> stk;
    private long minVal;
    public MinStack() {
       stk=new Stack<>(); 
    }
    public void push(int val) {
        long a=val;
        if(stk.isEmpty()){
            stk.push(a);
            minVal=a;
        }else if(a<minVal){
            stk.push(2l*a-minVal);
            minVal=a;
        }else{
            stk.push(a);
        }
    }
    public void pop() {
        if(stk.isEmpty()) return;
        long top=stk.pop();
        if(top<minVal){
            minVal=2L*minVal-top;
        }
        }
    public int top() {
        long top=stk.peek();
        if(top<minVal){
         return (int)minVal;
        }
        else{
            return (int)top;
        }
    }
    
    public int getMin() {
        return (int)minVal;
    }
}
