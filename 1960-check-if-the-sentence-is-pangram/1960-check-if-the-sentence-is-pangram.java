class Solution {
    public boolean checkIfPangram(String s) {
        if(s.length() < 26) return false;
        int[] count = new int[26];
        Arrays.fill(count,1);
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i) - 'a'] > 0) count[s.charAt(i) - 'a']--;
        }
        for(int c:count){
            if(c > 0) return false;
        }
        return true;
    }
}