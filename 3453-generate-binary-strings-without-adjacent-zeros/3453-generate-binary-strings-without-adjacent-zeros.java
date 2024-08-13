class Solution {
    public List<String> validStrings(int n) {
        List<String> res = new ArrayList<>();
        backtrack(1,"0",n,res);
        backtrack(1,"1",n,res);
        return res;
    }

    private void backtrack(int i,String s,int n,List<String> res){
        if(i == n){
             res.add(s);
             return;
        }
        if( i > n) return;
        if(s.charAt(s.length()-1) == ('0'))
            backtrack(i+1,s.concat("1"),n,res);
        if(s.charAt(s.length()-1) == ('1')){
            backtrack(i+1,s.concat("0"),n,res);
            backtrack(i+1,s.concat("1"),n,res);
        }
    }
}