class NeighborSum {

    int grid[][];

    public NeighborSum(int[][] grid) {
        this.grid = grid;
    }
    
    public int adjacentSum(int value) {
        return findAdjacentSum(value);
    }
    
    public int diagonalSum(int value) {
        return findDiagonalSum(value);
    }


    private int findAdjacentSum(int value){
        int r=0,c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == value){
                    r = i;
                    c = j;
                    break;
                }
            }
        }

        int sum = 0;
        if(r-1 >= 0 && r-1<grid.length ) sum += grid[r-1][c];
        if(r+1 >= 0 && r+1<grid.length ) sum += grid[r+1][c];
        if(c-1 >= 0 && c-1<grid[0].length ) sum += grid[r][c-1];
        if(c+1 >= 0 && c+1<grid[0].length ) sum += grid[r][c+1];
        return sum;
    }

    private int findDiagonalSum(int value){
        int r=0,c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == value){
                    r = i;
                    c = j;
                    break;
                }
            }
        }

        int sum = 0;
        if(r-1 >= 0 && r-1<grid.length && c-1 >= 0 && c-1 <grid[0].length) sum += grid[r-1][c-1];
        if(r-1 >= 0 && r-1<grid.length && c+1 >= 0 && c+1 <grid[0].length) sum += grid[r-1][c+1];
        if(r+1 >= 0 && r+1<grid.length && c-1 >= 0 && c-1 <grid[0].length) sum += grid[r+1][c-1];
        if(r+1 >= 0 && r+1<grid.length && c+1 >= 0 && c+1 <grid[0].length) sum += grid[r+1][c+1];
        return sum;
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */