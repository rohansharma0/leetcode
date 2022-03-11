class Solution {
    public boolean canJump(int[] nums) {
        
        int n = nums.length;
        
        int reachable = 0;
        
        
        for(int i = 0; i< n ; i++){
            if(reachable < i) return false;
            
            reachable = Math.max(reachable , i + nums[i]);
        }
        
        return true;
        
    }
    
//     public boolean solve(int idx , int[] nums , int[] dp){
        
//         if(idx == nums.length - 1) return true;
//         if(idx > nums.length - 1) return false;
        
//         if(dp[idx] != -1) return dp[idx] == 1 ? true : false; 
        
//         for(int i = 1 ; i<= nums[idx] ; i++){
            
//             if(solve(idx+i , nums , dp)){
//                 dp[idx + i] = 1; 
//                 return true;
//             }
//         }
//         dp[idx] = 0;
//         return false;
//     }
}