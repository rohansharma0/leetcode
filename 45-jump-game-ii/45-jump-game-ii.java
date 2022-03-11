class Solution {
    public int jump(int[] nums) {
        
        int[] dp = new int[nums.length];
        
        Arrays.fill(dp , -1);
        
        return solve(0,nums , dp);
       
    }
    
    public int solve(int idx , int[] nums , int[] dp){
        
        if(idx == nums.length -1) return 0;
        
        if(idx > nums.length -1) return (int)1e8;
        
        if(dp[idx] != -1) return dp[idx];
        
        int min = (int)1e8;
        
        for(int i = 1 ; i<=nums[idx] ; i++){
            int d = solve(idx + i , nums , dp);
            
            min = Math.min(min , d);
        }
        
        return dp[idx] =  min + 1;
        
    }
}