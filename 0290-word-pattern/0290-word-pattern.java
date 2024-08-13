class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        String[] a = s.split(" ");
        if(a.length != pattern.length()) return false;
        for(int i=0;i<a.length;i++){
            if(!map.containsKey(pattern.charAt(i)) && map.containsValue(a[i])) return false;
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(a[i])) return false;
                else continue;
            }
            else map.put(pattern.charAt(i),a[i]);
        }
        return true;
    }
}