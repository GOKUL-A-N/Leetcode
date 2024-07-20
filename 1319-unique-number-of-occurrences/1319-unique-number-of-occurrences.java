class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Integer num : map.keySet()){
            if(set.contains(map.get(num))) return false;
            set.add(map.get(num));
        }
        return true;
    }
}