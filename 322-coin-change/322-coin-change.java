class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int n = coins.length;
        
        int[][] dp = new int[n][amount+1];
        
        for(int[] x : dp){
            Arrays.fill(x , -1);
        }
        
        int ans = solve(n-1 , coins , amount , dp);

        if(ans == (int)1e8){
            return -1;
        }
        return ans;
    }
    
    public int solve(int i , int[] coins , int tar , int[][] dp){
        
        if(i == 0){
            if(tar % coins[i] == 0) return tar / coins[i];
            return (int)1e8;
        }
        
        if(dp[i][tar] != -1) return dp[i][tar];
        
        int take = (int)1e8;
        
        if(tar >= coins[i]){
            take = solve(i , coins , tar - coins[i] , dp) + 1;
        }
        
        int notTake = solve(i-1 , coins , tar , dp);
        
        return dp[i][tar] =  Math.min(take , notTake);
        
    }
}