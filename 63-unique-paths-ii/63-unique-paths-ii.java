class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int [][] dp = new int[n][m];
        
        for(int[] x : dp){
            Arrays.fill(x , -1);
        }
        return solve(n-1 , m-1 , obstacleGrid , dp);
    }
    
    public int solve(int i , int j , int[][] nums , int[][] dp){
        
        if(i < 0 || j < 0 || nums[i][j] == 1) return 0;
        if(i == 0 && j == 0) return 1;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        int top = solve(i-1 , j , nums , dp);
        int left = solve(i , j-1 , nums , dp);
        
        return dp[i][j] =  top + left;
    }
}