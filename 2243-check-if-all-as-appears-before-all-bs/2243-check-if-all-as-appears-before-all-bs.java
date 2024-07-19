class Solution {
    public boolean checkString(String s) {
        int state = 'a';
        for(int i=0;i<s.length();i++){
            if(state == 'b' && s.charAt(i) == 'a') return false;
            if(s.charAt(i) == 'b' && state=='a') state = 'b';
        }
        return true;
    }
}