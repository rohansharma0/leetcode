class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][nums.length+1];
        
        for(int [] x : dp){
            Arrays.fill(x , -1);
            
        }
        return solve(0 , 0 , nums , dp);
    }
    
    public int solve(int i , int pi , int[] nums , int[][] dp){
        
        if(i == nums.length) return 0;
        
        if(dp[i][pi] != -1) return dp[i][pi];
        
        int pick = 0;
        if(pi == 0 || nums[i] > nums[pi-1]){
            pick = solve(i+1 , i+1 , nums , dp) + 1;    
        }
        
        int notPick = solve(i+1 , pi , nums , dp);

        return dp[i][pi] = Math.max(pick , notPick);
    }
}