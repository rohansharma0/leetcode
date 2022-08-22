class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        
        int[][][] dp = new int[n+1][2][3];
        
        for(int j = 0 ; j < 2 ; j++){
            for(int k = 0 ; k < 3 ; k++){
                dp[n][j][k] = 0;
            }
        }
        
        for(int i = 0 ; i <= n ; i++){
            for(int j = 0 ; j < 2 ; j++){
                dp[i][j][0] = 0;
            }
        }
        
        for(int i = n-1 ; i>= 0 ; i--){
            
            for(int j = 0 ; j < 2; j++){
                
                for(int k = 1 ; k < 3 ; k++){
                    
                    int profit = 0;
        
                    if(j == 1){

                        profit =  Math.max(dp[i+1][0][k] - prices[i] , dp[i+1][1][k]);

                    }else{

                       profit =  Math.max(dp[i+1][1][k-1] + prices[i] , dp[i+1][0][k]); 
                    }

                    dp[i][j][k] = profit;
                }
                
            }
            
        }
        
        return dp[0][1][2];
       
    }
    
}