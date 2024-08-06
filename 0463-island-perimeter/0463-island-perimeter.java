class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                perimeter += findPerimeter(grid,i,j);
            }
        }
        return perimeter;
    }
    private int findPerimeter(int[][] grid,int i,int j){
        if(grid[i][j] == 0) return 0;
        int count = 4;
        if(j>0 && grid[i][j-1] == 1) count--;
        if(j<grid[i].length-1 && grid[i][j+1] == 1) count--;
        if(i> 0 && grid[i-1][j] == 1) count--;
        if(i <grid.length-1 && grid[i+1][j] == 1) count--;
        return count;
    }
}