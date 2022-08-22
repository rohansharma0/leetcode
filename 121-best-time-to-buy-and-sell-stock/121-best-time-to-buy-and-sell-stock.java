class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        
        int[][] dp = new int[n][3];
        
        for(int[] x : dp){
            Arrays.fill(x , -1);
        }
        
        return solve(0 , 0 , prices , dp);
    }
    
    public int solve(int i , int buy , int[] prices , int[][] dp){
        
        if(i == prices.length) return 0;
        
        if(dp[i][buy] != -1) return dp[i][buy];
        
        int gain = 0;
        
        if(buy == 1){
            gain = Math.max(solve(i+1 , 2 , prices , dp) + prices[i] , solve(i+1 , 1 , prices , dp));    
        }else if(buy == 2){
            gain =  solve(i+1 , 2 , prices , dp);
        }else{
            gain = Math.max(solve(i+1 , 1 , prices , dp) - prices[i] , solve(i+1 , 0 , prices , dp));    
        } 
        
        return dp[i][buy] = gain;
    }
}