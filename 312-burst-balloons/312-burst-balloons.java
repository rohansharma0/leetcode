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
        
        for(int i = n-2 ; i >= 1 ; i--){
            
            for(int j = 1 ; j<= n-2 ; j++){
                
                if(i > j) continue;
                
                int max = Integer.MIN_VALUE;
        
                for(int k = i ; k <=  j ; k++){

                    int cost = (arr[i-1] * arr[k] * arr[j+1]) + dp[i][k-1] + dp[k+1][j];
                    max = Math.max(max , cost);
                }
                
                dp[i][j] = max;
                
            }
            
        }
        
        
        return dp[1][n-2];
        
    }
    
}