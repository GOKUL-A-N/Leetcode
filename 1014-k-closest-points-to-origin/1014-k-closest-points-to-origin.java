class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>(
           (a,b) -> (b[2]-a[2]) 
        );
        for(int i=0;i<points.length;i++){
            q.offer(new int[]{points[i][0],points[i][1],points[i][0] * points[i][0] + points[i][1] * points[i][1]});
            while(q.size() > k) q.poll();
        }
        int size = q.size();
        int[][] res = new int[size][2];
        for(int i=0;i<size;i++){
            int[] curr = q.poll();
            res[i][0] = curr[0];
            res[i][1] = curr[1];
        }
        return res;
    }
}