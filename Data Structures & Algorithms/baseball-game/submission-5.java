class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> stk=new Stack<>();
        int sum=0;
            for(String s:operations){
                if(s.equals("+")){
                    int c=stk.pop();
                    int b=c+stk.peek();
                    stk.push(c);
                    stk.push(b);
                    sum+=b;
                }else if(s.equals("D")){
                    int a=2*(stk.peek());
                    stk.push(a);//stk.push(2*stk.peek());
                    sum+=a;//sum+=stk.peek();

                }else if(s.equals("C")){
                    sum-=stk.peek();
                    stk.pop();//sum-=stk.pop();
                }else{
                    int d=Integer.parseInt(s);//stk.push(Integer.parseInt(s));
                    stk.push(d);
                    sum+=d;//sum+=stk.peek();
                }
            }
            return sum;
    }
}