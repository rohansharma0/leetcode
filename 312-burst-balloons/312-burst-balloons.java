class Solution {
    public int maxCoins(int[] nums) {
        
        int[] arr = new int[nums.length+2];
        int n = arr.length;
        
        for(int i = 0 ; i< n ; i++){
            if(i == 0 || i == n-1){
                arr[i] = 1;
            }else{
                arr[i] = nums[i-1];
            }
        }

        int[][] dp = new int[n][n];
        
        for(int[]x : dp){
            Arrays.fill(x, -1);
        }
        
        return solve(1 , n-2 , arr , dp);
        
    }
    
    public int solve(int i , int j , int[] nums , int[][] dp){
        
        if(i > j) return 0;
        
        if(dp[i][j] != -1 )return dp[i][j];
        
        int max = Integer.MIN_VALUE;
        
        for(int k = i ; k <=  j ; k++){
            
            int cost = (nums[i-1] * nums[k] * nums[j+1]) + solve(i , k-1 , nums , dp) + solve(k+1 , j, nums , dp);
            
            max = Math.max(max , cost);
        }
        
        return dp[i][j] = max;
    }
}