class Solution {
    public boolean canJump(int[] nums) {
        
        int[] dp = new int[nums.length];
        
        Arrays.fill(dp , -1);
        //-1 for not visited
        // 0 for visited but false
        // 1 for visited but true 
        
        return solve(0 , nums , dp);
        
    }
    
    public boolean solve(int idx , int[] nums , int[] dp){
        
        if(idx == nums.length - 1) return true;
        if(idx > nums.length - 1) return false;
        
        if(dp[idx] != -1) return dp[idx] == 1 ? true : false; 
        
        for(int i = 1 ; i<= nums[idx] ; i++){
            
            if(solve(idx+i , nums , dp)){
                dp[idx + i] = 1; 
                return true;
            }
        }
        dp[idx] = 0;
        return false;
    }
}