class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        
        for(int i = 1 ; i<= n ; i++){
            
            int min = Integer.MAX_VALUE;
        
            for(int j = 1 ; j*j <= i ; j++){
                int x = dp[i - (j*j)] + 1; 
                min = Math.min(min , x);
            }

            dp[i] = min;
            
        }
        
        return dp[n];
    }
}