class Solution {
    public int integerBreak(int n) {
        
        int[] dp = new int[n+1];
        
        Arrays.fill(dp , -1);
        
        int max = 0;
        for(int i = 1 ; i< n ; i++){
            int x = solve(n - i , dp) * i;
            max =  Math.max(x , max);
        }
        return max;
    }
    
    public int solve(int n , int[] dp){
        
        if(n == 1) return 1;
        
        if(dp[n] != -1) return dp[n];
        
        int max = 0;
        for(int i = 1; i<=n; i++){
            int x = solve(n - i , dp) * i;
            max = Math.max(x , max);
        }
        return dp[n] =  Math.max(n , max);
        
    }
}