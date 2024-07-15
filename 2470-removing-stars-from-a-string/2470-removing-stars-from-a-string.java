class Solution {
    public String removeStars(String s) {
        String res="";
        Stack stack = new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '*') stack.push(s.charAt(i));
            else stack.pop();
        }
        while(!stack.isEmpty()){
            res = (char)stack.pop() + res;
        }
        return res;
    }
}