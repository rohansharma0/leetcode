class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        
        int[][] dp = new int[n][2];
        for(int[] x : dp){
            Arrays.fill(x , -1);
        }
        return solve(0 , prices , 1 , dp);
    }
    
    public int solve(int i , int[] arr , int buy , int[][] dp){
        
        if(i == arr.length) return 0;
        
        if(dp[i][buy] != -1) return dp[i][buy];
        
        int profit = 0;
        
        if(buy == 1){
            profit = Math.max(-arr[i] + solve(i+1 , arr , 0 , dp) , solve(i+1 , arr , 1 , dp));
        }else{
            profit = Math.max(+arr[i] + solve(i+1 , arr , 1 , dp) , solve(i+1 , arr , 0 , dp));
        }
        
        return dp[i][buy] =  profit;
    }
}