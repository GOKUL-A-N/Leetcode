class Solution {
    public String findLatestTime(String s) {
        char[] res = s.toCharArray();
        if(res[0] == '?'){
            if(res[1] == '1' || res[1] == '0' || res[1] == '?') res[0] = '1';
            else res[0] = '0';
        }
        if(res[1] == '?'){
            if(res[0] == '1') res[1] = '1';
            else res[1] = '9';
        }
        if(res[3] == '?'){
            res[3] = '5';
        }if(res[4] == '?'){
            res[4] = '9';
        }
        return new String(res);
    }
}