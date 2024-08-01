class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length , n =matrix[0].length;
        int[][] newArr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i == 0 || j == 0) newArr[i][j] =(matrix[i][j])-'0';
                else{
                    if(matrix[i][j] == '0') newArr[i][j] = 0;
                    else{
                        newArr[i][j] = findMin(newArr[i][j-1],newArr[i-1][j],newArr[i-1][j-1])+1;
                    }
                }
            }
        }
        int res = newArr[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res = Math.max(newArr[i][j],res);
            }
        }
        return res*res;
    }
    public int findMin(int val1,int val2 , int val3){
        return Math.min(val1,Math.min(val2,val3));
    }
}