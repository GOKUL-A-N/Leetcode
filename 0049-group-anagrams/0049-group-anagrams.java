class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] a = s.toCharArray();
            Arrays.sort(a);
            String keyString = new String(a);
            if(!map.containsKey(keyString)){
                map.put(keyString, new ArrayList<>());
            }
            map.get(keyString).add(s);
        }
        return new ArrayList<>(map.values());
    }
}