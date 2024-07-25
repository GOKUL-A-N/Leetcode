class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<=s.length()-p.length();i++){
            if(isAnagram(s.substring(i,i+p.length()),p)){
                res.add(i);
            } 
        }
        return res;
    }

    private boolean isAnagram(String s1 , String s2){
        int res[] = new int[26];
        for(int i=0;i<s1.length();i++){
            res[s1.charAt(i) - 'a']++;
            res[s2.charAt(i) - 'a']--;
        }
        for(int a:res){
            if(a != 0) return false;
        }
        return true;
    }
}