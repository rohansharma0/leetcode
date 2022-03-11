class Solution {
    public int jump(int[] nums) {
        
        int n = nums.length;
        
        int[] dp = new int[n];
        
        for(int i = n-2 ; i>= 0 ; i--){
            int min = (int)1e8;
        
            for(int j = 1 ; j<=nums[i] ; j++){
                
                int d = 0;
                if(i + j < n){
                    d = dp[i+j];
                }
                min = Math.min(min , d);
            }
            dp[i] = min + 1;
        }
        
        
        return dp[0];
       
    }
    
//     public int solve(int idx , int[] nums , int[] dp){
        
//         if(idx == nums.length -1) return 0;
        
//         if(idx > nums.length -1) return (int)1e8;
        
//         if(dp[idx] != -1) return dp[idx];
        
//         int min = (int)1e8;
        
//         for(int i = 1 ; i<=nums[idx] ; i++){
//             int d = solve(idx + i , nums , dp);
            
//             min = Math.min(min , d);
//         }
        
//         return dp[idx] =  min + 1;
        
//     }
}