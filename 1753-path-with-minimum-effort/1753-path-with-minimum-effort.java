class Solution {
    public int minimumEffortPath(int[][] heights) {
         int rows = heights.length;
        int cols = heights[0].length;
        int[][] dp = new int[rows][cols];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dp[0][0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, 0, 0});

        int[] dirs = {0, 1, 0, -1, 0};

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int r = curr[1], c = curr[2], effort = curr[0];
            if (r == rows - 1 && c == cols - 1) {
                return effort;
            }
            for (int i = 0; i < 4; i++) {
                int nr = r + dirs[i], nc = c + dirs[i + 1];
                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols) {
                    int newEffort = Math.max(effort, Math.abs(heights[nr][nc] - heights[r][c]));
                    if (newEffort < dp[nr][nc]) {
                        dp[nr][nc] = newEffort;
                        pq.offer(new int[]{newEffort, nr, nc});
                    }
                }
            }
        }
        return -1; // unreachable
    }
}