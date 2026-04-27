class Solution {
    public boolean isValid(String s) {
        if(s==null || s.length()==0){
            return false;
        }
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                stk.push(ch);
            }else {
                if(stk.isEmpty()){
                return false;
            }
            if((stk.peek()=='('&& ch==')')||(stk.peek()=='{'&&ch=='}')||(stk.peek()=='['&&ch==']')){
                stk.pop();
            }else{
            return false;
            }
        }
    }
        return stk.isEmpty();
    }
}
