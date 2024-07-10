class Solution {
    int ROWS;
    int COLS;
    public int numIslands(char[][] grid) {
        int count = 0;
        ROWS = grid.length;
        COLS = grid[0].length;
        for(int r=0;r<ROWS;r++){
            for(int c=0;c<COLS;c++){
                if(grid[r][c] == '1'){
                    count++;
                    dfs(grid,r,c);
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid,int r,int c){
        if(
            r<0 || c<0 || r >= ROWS || c>= COLS || grid[r][c] == '0'
        ) return;
        grid[r][c] = '0';
        dfs(grid,r+1,c);
        dfs(grid,r-1,c);
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);
    }
}