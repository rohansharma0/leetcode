class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        int[][] dp = new int[n][m];

        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(i == 0 && j == 0){
                    dp[i][j] = grid[i][j];
                }else{
                    int top = (int)1e8;
                    int left = (int)1e8;

                    if(i>0){
                        top = dp[i-1][j];
                    }
                    if(j>0){
                        left = dp[i][j-1];
                    }
                    dp[i][j] = Math.min(top , left) + grid[i][j];
                }
            }
        }
        
        return dp[n-1][m-1];
    }
    
}