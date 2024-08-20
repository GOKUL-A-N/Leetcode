class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length,n=grid[0].length;
        int fresh = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 2) q.offer(new int[]{i,j});
                if(grid[i][j] == 1) fresh++;
            }
        }

        int count = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty() && fresh != 0){
            count++;
            int size = q.size();
            for(int i=0;i<size;i++){
                int[] rotten = q.poll();
                int r= rotten[0] , c = rotten[1];
                for(int[] dir:dirs){
                    int x = r+dir[0],y = c+dir[1];
                    if(0<=x && x<m && 0<=y && y<n && grid[x][y] == 1){
                        grid[x][y]=2;
                        q.offer(new int[]{x,y});
                        fresh-=1;
                    }
                }
            }
        }

        return fresh == 0 ? count : -1;
    }
}