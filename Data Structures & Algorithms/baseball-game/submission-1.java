class Solution {
    public int calPoints(String[] operations) {
        int res=0;
        Stack <Integer> stack=new Stack<>();
        for(String s:operations){
            if(s.equals("+")){
                int top=stack.pop();
                int newTop=top+stack.peek();
                stack.push(top);
                stack.push(newTop);
                res+=newTop;
            } else if(s.equals("D")){
                stack.push(2*stack.peek());
                res+=stack.peek();
            } else if(s.equals("C")){
                res-=stack.pop();
            }
            else{
                stack.push(Integer.parseInt(s));
                res+=stack.peek();
            }
        }
        return res;
    }
}