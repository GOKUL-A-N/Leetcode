class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // initailize the frequency array and requirded 
        int[] count = new int[26];
        int required = s1.length();

        // to count the occurance of the character
        for(char a:s1.toCharArray()){
            ++count[a - 'a'];
        }

        // using sliding window technique to find match
        for(int r=0;r<s2.length();r++){
            // to decrement required if matches
            if(--count[s2.charAt(r) - 'a'] >= 0) required--;

            // when the window is out of range
            if(r >= s1.length()){
                if(++count[s2.charAt(r-s1.length()) - 'a'] > 0) required++;
            }

            if(required == 0) return true;
        }
        return false;
    }
}