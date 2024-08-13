class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int idx = matrix.length-1;
        for(int i=1;i<matrix.length;i++){
            if(matrix[i][0] > target){
                 idx = i-1;
                 break;
            }
        }
        int l=0,r=matrix[idx].length-1;
        while(l<r){
            int mid = (l+r) / 2;
            if(matrix[idx][mid] == target) return true;
            else if(matrix[idx][mid] < target) r = mid-1;
            else l = mid;
        }
        return false;
    }
}