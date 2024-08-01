class Solution {
    public String frequencySort(String s) {
        // counting the number of occurance using hashmap
        Map<Character,Integer> map = new HashMap<>();
        for(char a:s.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> heap = new PriorityQueue<>(
            (a,b) -> b.getValue() - a.getValue()
        );

        heap.addAll(map.entrySet());
        StringBuilder res = new StringBuilder();
        while(!heap.isEmpty()){
            Map.Entry<Character,Integer> a = heap.poll();
            for(int i=0;i<a.getValue();i++){
                res.append(a.getKey());
            }
        }
        return res.toString();
    }
}