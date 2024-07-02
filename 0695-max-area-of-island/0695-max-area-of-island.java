class Solution {
    public int ROWS;
    public int COLS;
    public int maxAreaOfIsland(int[][] grid) {
        ROWS = grid.length;
        COLS = grid[0].length;
        int area = 0;
        Set<String> visited = new HashSet<String>();
        for(int r=0;r<ROWS;r++){
            for(int c=0;c<COLS;c++){
                area = Math.max(area , dfs(grid , visited , r , c));
            }
        }
        return area;
    }
    private int dfs(int[][] grid,Set<String> visited,int r,int c){
        if(
            r<0 || c < 0 || r == ROWS || c == COLS || visited.contains(r + "," + c) || grid[r][c] == 0
        ) return 0;
        visited.add(r +","+c);
        return 1 + dfs(grid , visited , r-1 , c) + dfs(grid , visited , r+1 , c) + dfs(grid , visited , r , c-1) + dfs(grid , visited , r , c+1);
    }
}