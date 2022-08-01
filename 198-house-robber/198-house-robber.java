class Solution {
    public int rob(int[] nums) {
       
        int n = nums.length;
        int[] dp = new int[n];
        
        for(int i = 0 ; i < n ; i++){
            
            int take = nums[i];
            
            if(i-2 >= 0){
                take += dp[i-2];
            }
            
            int notTake = 0;
  
            if(i-1 >= 0){
                notTake += dp[i-1];
            }
            
            dp[i] = Math.max(take , notTake);
            
        }
        
        return dp[n-1];
        
    }
    
}