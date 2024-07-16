class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for(int i=0;i<s.length()-1;i++){
            int elOne = (int)(s.charAt(i));
            int elTwo = (int)(s.charAt(i+1));
            score += Math.abs(elOne-elTwo);
        }
        return score;
    }
}