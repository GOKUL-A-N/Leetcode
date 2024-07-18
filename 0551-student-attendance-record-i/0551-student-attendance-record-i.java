class Solution {
    public boolean checkRecord(String s) {
        int abs = 0;
        int late = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'A') abs++;
            if(s.charAt(i) == 'L' && (s.length()-i) >= 3){
                if(s.charAt(i+1) == 'L' && s.charAt(i+2) == 'L' ) late+=3;
            }
        }
        return (abs < 2) && (late < 3);
    }
}