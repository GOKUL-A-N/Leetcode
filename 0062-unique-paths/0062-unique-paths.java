class Solution {
    
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        return helper(m,n,dp);
    }
    private int helper(int m,int n,int[][] dp){
        if(dp[m][n] != 0) return dp[m][n];
        else if(m == 1 || n== 1){
             dp[m][n] = 1;
             return dp[m][n];
        }
        dp[m][n] = helper(m-1,n,dp) + helper(m,n-1,dp);
        return dp[m][n];
    }
}