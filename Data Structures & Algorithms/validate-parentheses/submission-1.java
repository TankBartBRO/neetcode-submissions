class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char brk:s.toCharArray()) {
            if(brk=='(' || brk=='{' || brk=='['){
                stk.push(brk);
            }else if (stk.isEmpty()) {
                return false;
            }else if((brk == ')' && stk.peek()=='(') ||(brk=='}' && stk.peek()=='{') ||(brk==']' && stk.peek()=='[')){
                stk.pop();
            }else{
                return false;
            }
        }

        return stk.isEmpty();
    }
}