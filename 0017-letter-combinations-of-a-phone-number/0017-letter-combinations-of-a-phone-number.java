class Solution {

    private String findString(char ch){
         if(ch=='2'){
            return "abc";
        }
        if(ch=='3'){
            return "def";
        }
        if(ch=='4'){
            return "ghi";
        }
        if(ch=='5'){
            return "jkl";
        }
        if(ch=='6'){
            return "mno";
        }
        if(ch=='7'){
            return "pqrs";
        }
        if(ch=='8'){
            return "tuv";
        }
        else{
            return "wxyz";
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length() == 0) return res;
        backtrack(0,res,new StringBuilder(),digits);
        return res;
    }

    private void backtrack(int idx,List<String> res,StringBuilder s,String digits){
        if(idx >= digits.length()){
            res.add(s.toString());
            return;
        }
        String str = findString(digits.charAt(idx));
        for(int i=0;i<str.length();i++){
            s.append(str.charAt(i));
            backtrack(idx+1,res,s,digits);
            s.deleteCharAt(s.length()-1);
        }
    }
}