class Solution {
    public int change(int amount, int[] coins) {
        
        int n = coins.length;
        
        int[][] dp = new int[n][amount+1];
        
        for(int[] x : dp){
            Arrays.fill(x , -1);
        }
        
        return solve(n-1 , coins , amount , dp);
    }
    
    public int solve(int i , int[] coins , int amt , int[][] dp){
        
        if(i == 0){
            if(amt % coins[i] == 0) return 1;
            return 0;
        }
        
        if(dp[i][amt] != -1) return dp[i][amt];
        
        //nottake
        int nottake = solve(i-1 , coins , amt , dp);
        
        //take
        int take = 0;
        
        if(coins[i] <= amt){
            take = solve(i , coins , amt - coins[i] , dp);
        }
        
        return dp[i][amt] = nottake + take;
        
    }
}