class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(String a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for (String v : arr) {
            if (map.get(v) == 1) {
                --k;
                if (k == 0) {
                    return v;
                }
            }
        }
        return "";
    }
}