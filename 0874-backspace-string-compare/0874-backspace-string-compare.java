class Solution {
    public boolean backspaceCompare(String s, String t) {
        return generateString(s).equals(generateString(t));
    }
    private String generateString(String str){
        Stack<Character> stack = new Stack<>();
        for(char s:str.toCharArray()){
            if(s == '#'){
                if(!stack.isEmpty()) stack.pop();
            }
            else{
                stack.push(s);
            }
            
        }
        String res = new String();
        while(!stack.isEmpty()){
            res = stack.pop() + res;
        }
        return res;
    }
}