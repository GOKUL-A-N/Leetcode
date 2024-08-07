class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer,List<int[]>> edges = new HashMap<>();
        for(int[] time:times){
            edges.computeIfAbsent(time[0],key -> new ArrayList<>()).add(new int[]{time[1],time[2]});
        } 

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            Comparator.comparingInt(a->a[0])
        );
        Set<Integer> visited = new HashSet<>();
        minHeap.offer(new int[]{0,k});
        int t = 0;
        while(!minHeap.isEmpty()){
            int[] curr = minHeap.poll();
            int n1 = curr[1] , w1 = curr[0];
            if(visited.contains(n1)) continue;
            t = w1;
            visited.add(n1);
            if(edges.containsKey(n1)){
                for(int[] edge:edges.get(n1)){
                    int n2 = edge[0] , w2 = edge[1];
                    if(!visited.contains(n2)){
                        minHeap.offer(new int[]{w1+w2,n2});
                    }
                }
            }
        }

        return visited.size() == n ? t : -1;
    }
}