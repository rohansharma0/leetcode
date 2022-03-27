class Solution {
    public int maxProfit(int[] prices) {
        
        int[][][] dp = new int[prices.length][2][3];
        
        for(int[][] x : dp){
            for(int[] y : x){
                Arrays.fill(y , -1);
            }
        }
        
        return solve(0 , prices , 1 , 2 , dp);
        
    }
    
    public int solve(int i , int[] prices , int buy , int cap , int[][][] dp){
        
        if(cap == 0 || i == prices.length) return 0;
        
        if(dp[i][buy][cap] != -1) return dp[i][buy][cap];
        
        int profit = 0;
        
        if(buy == 1){
            
            profit += Math.max(-prices[i] + solve(i+1 , prices , 0 , cap , dp) , solve(i+1 , prices , 1 , cap , dp));
            
        }else{
            profit += Math.max(prices[i] + solve(i+1 , prices , 1 , cap-1 , dp) , solve(i+1 , prices , 0 , cap , dp));
        }
        
        return dp[i][buy][cap] = profit;
    }
}