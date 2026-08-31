class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk=new Stack<>();
        int sum=0;
        for(String op:operations){
            if(op.equals("+")){
                int a=stk.pop();
                int nsum=a+stk.peek();
                stk.push(a);
                stk.push(nsum);
                sum+=nsum;
            }else if(op.equals("C")){
                sum-=stk.pop();

            }else if(op.equals("D")){
                stk.push(2*stk.peek());
                sum+=stk.peek();
            }else{
                stk.push(Integer.parseInt(op));
                sum+=stk.peek();
            }
        }
        return sum;
    }
}