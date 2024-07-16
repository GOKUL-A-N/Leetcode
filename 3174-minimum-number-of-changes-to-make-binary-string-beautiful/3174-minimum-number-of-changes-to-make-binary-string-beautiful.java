class Solution {
    public int minChanges(String s) {
        char[] res = s.toCharArray();
        int changes  = 0;
        for(int i=0;i<s.length()-1;i+=2){
            if(res[i] != res[i+1]) changes++;
        }
        return changes;
    }
}