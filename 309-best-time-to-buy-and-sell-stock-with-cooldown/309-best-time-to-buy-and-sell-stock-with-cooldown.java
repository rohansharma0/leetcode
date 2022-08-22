class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        
        int[][] dp = new int[n+1][2];
        
        for(int i = n-1; i>= 0 ; i--){
            
            for(int buy = 0 ; buy < 2 ; buy++){
                
                int profit = 0;
        
                if(buy == 1){
                    profit = Math.max(dp[i+1][0] - prices[i] ,dp[i+1][1]);
                }else{
                    profit = Math.max(i+2 < n ?  dp[i+2][1] + prices[i] :  prices[i] , dp[i+1][0]); 
                }

                dp[i][buy] = profit;
                
            }
            
        }
        
        
        return dp[0][1];
        
    }
}