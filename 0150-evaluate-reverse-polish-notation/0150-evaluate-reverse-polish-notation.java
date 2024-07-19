class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token:tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int a = (int)stack.pop();
                int b = (int)stack.pop();
                if(token.equals("+")){
                    stack.push(b+a);
                }else if(token.equals("-")){
                    stack.push(b-a);
                }
                else if(token.equals("/")){
                    stack.push(b/a);
                }else{
                    stack.push(b*a);
                }
            }else{
                stack.push(Integer.valueOf(token));
            }
            
        }
        return (int)stack.pop();
    }
}