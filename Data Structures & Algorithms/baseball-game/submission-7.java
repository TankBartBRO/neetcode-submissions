class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> stk=new Stack<>();
        int sum=0;
        for(String s:operations){
            if(s.equals("+")){
                int a=stk.pop();
                int ns=a+stk.peek();
                stk.push(a);
                stk.push(ns);
                sum+=ns;
            }else if(s.equals("C")){
                sum-=stk.pop();
            }else if(s.equals("D")){
                int d=2*stk.peek();
                stk.push(d);
                sum+=d;
            }else{
                stk.push(Integer.parseInt(s));
                sum+=stk.peek();
            }
            
        }
        return sum;
    }
}