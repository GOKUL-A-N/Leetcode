class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        // map to store the count of each words
        Map<String,Integer> countMap = new HashMap<String,Integer>();
        // counting the count of eack word
        for(String word:words){
            countMap.put(word,countMap.getOrDefault(word,0)+1);
        }
        //creating priority queue to store the top k frequent words
        PriorityQueue<Map.Entry<String,Integer>> heap = new PriorityQueue<>(
            (a,b) -> {
                if(!a.getValue().equals(b.getValue())){
                    return a.getValue()-b.getValue();
                }
                else{
                    return b.getKey().compareTo(a.getKey());
                }
            }
        );

        // adding elements to heap
        for(Map.Entry<String,Integer> entry : countMap.entrySet()){
            heap.offer(entry);
            while(heap.size() > k) heap.poll();
        }
        // creating list and returning the elements
        List<String> result = new ArrayList<>();
        while(!heap.isEmpty()){
            result.add(heap.poll().getKey());
        }
        Collections.reverse(result);
        return result;
    }
}