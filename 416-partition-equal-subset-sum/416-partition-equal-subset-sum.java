class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int e : nums){
            sum += e;
        }
        if(sum % 2 != 0) return false;
        int[][] dp = new int[nums.length][sum/2+1];
        
        for(int[] x :dp){
            Arrays.fill(x , -1);
        }
        
        return solve(nums.length-1 , nums , sum / 2 , dp);
    }
    
    public boolean solve(int i , int[] nums , int tar , int[][] dp){
        if(tar == 0) return true;
        
        if(i == 0){
            return (nums[i] == tar);
        }
        
        if(dp[i][tar] != -1) return (dp[i][tar] == 1); 
        
        boolean notTake = solve(i-1 , nums , tar , dp);
        boolean take = false;
        if(nums[i] <= tar){
            take = solve(i- 1 , nums , tar - nums[i] , dp);
        }
        boolean res = notTake | take;
        if(res){
            dp[i][tar] = 1;
        }else{
            dp[i][tar] = 0;
        }
        return res;
    }
}