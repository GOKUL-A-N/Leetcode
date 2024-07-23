class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] directory = path.split("/");
        for(String dir:directory){
            if(dir.equals( ".") || dir.isEmpty()) continue;
            else if(dir.equals( "..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(dir);
            }
        }
        StringBuilder res = new StringBuilder();
        for(String str : stack){
            res.append("/").append(str);
        }
        return res.length() > 0 ?res.toString():"/";
    }
}