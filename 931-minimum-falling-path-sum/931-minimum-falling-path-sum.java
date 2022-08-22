class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int ans = Integer.MAX_VALUE;
        
        int[][] dp = new int[n][m];
        
        for(int j = 0 ;j< m ; j++){
            dp[0][j] = matrix[0][j];
        }
        
        for(int i = 1 ; i < n ; i++){
            
            for(int j = 0 ; j< m ; j++){
                
                int top = dp[i-1][j];

                int topLeft = (int)1e8;
                int topRight = (int)1e8;
                
                if(j-1 >= 0){
                    topLeft = dp[i-1][j-1];
                }
                if(j+1 < m){
                    topRight = dp[i-1][j+1];
                }
                
                
                dp[i][j] = Math.min(top , Math.min(topLeft , topRight)) + matrix[i][j];
            }
            
        }
        
        
        for(int j = 0 ; j< m ; j++){
            
            ans = Math.min(ans ,dp[n-1][j]);
            
        }
        
        return ans;
        
    }
}