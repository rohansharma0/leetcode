class Solution {
    public boolean divisorGame(int n) {
        int [] dp = new int[n+1];
        Arrays.fill(dp , -1);
        
        return solve(n , dp);
    }
    
    public boolean solve(int n , int[] dp){
        
        if(n == 1) return false;
        
        if(dp[n] != -1) return (dp[n] == 1);
        
        for(int i = 1 ; i< n ; i++){
            if(n % i == 0){
                if(!solve(n-i , dp)){
                    dp[n] = 1;
                    return true;
                }
            }   
        }
        dp[n] = 0;
        return false;
    }
}