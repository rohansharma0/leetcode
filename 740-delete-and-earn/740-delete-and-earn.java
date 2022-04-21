class Solution {
    public int deleteAndEarn(int[] nums) {
        
        int[] freq = new int[10002];
        int[] dp = new int[10002];
        
        for(int e : nums){
            freq[e]++;
        }
        
        Arrays.fill(dp , -1);
        
        return solve(10001 , freq , dp);
    }
    
    public int solve(int i , int[] freq , int[] dp){
        
        if(i < 0) return 0;
        
        if(dp[i] != -1) return dp[i];
        
        int nottake = solve(i-1 , freq , dp);
        
        int take = 0;
        
        if(freq[i] != 0){
            take = solve(i-2 , freq , dp) + (freq[i] * i);
        }
        return dp[i] = Math.max(take , nottake);
    }
}