class Solution {
    public int rob(int[] nums) {
       
        int n = nums.length;
        
        int[] dp = new int[n];
        Arrays.fill(dp , -1);
        return solve(n-1 , nums , dp);
        
    }
    
    public int solve(int i , int[] nums , int[] dp){

        if(i < 0){
            return 0;
        }
        
        if(dp[i] != -1) return dp[i];
        
        
        int take = solve(i-2 , nums , dp) + nums[i];
        
        int notTake = solve(i-1 , nums , dp);
        
        return dp[i] = Math.max(take , notTake);
    }
    
}