class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        
        int[][] dp = new int[n+1][n+1];
        
        for(int i = n-1 ; i>= 0 ; i--){
            
            for(int pi = i-1 ; pi>= -1 ; pi--){
                
                int pick = 0;
                if(pi == -1 || nums[i] > nums[pi]){
                    pick = dp[i+1][i+1] + 1;    
                }

                int notPick = dp[i+1][pi+1];

                dp[i][pi+1] = Math.max(pick , notPick);
                
            }
            
        }
        
        
        return dp[0][0];
    }
}