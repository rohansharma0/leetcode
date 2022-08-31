class Solution {
    public int minCost(int n, int[] cuts) {
        
        int[] arr = new int[cuts.length + 2];
        
        for(int i = 0; i < arr.length ; i++){
            if(i == 0){
                arr[i] = 0;
            }else if(i == arr.length-1){
                arr[i] = n;
            }else{
                arr[i] = cuts[i-1];
            }
        }
        
        Arrays.sort(arr);
        n = arr.length;
        int[][] dp = new int[n][n];
        
        for(int[]x : dp){
            Arrays.fill(x , -1);
        }
        
        return solve(1 , n-2 , arr , dp);
        
    }
    
    public int solve(int i, int j, int[] cuts , int[][] dp){
        
        if(i > j) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        int min = Integer.MAX_VALUE;
        
        for(int k = i ; k <= j ; k++){
            
            int costs = cuts[j+1] - cuts[i-1] + solve(i , k -1 , cuts , dp) + solve(k+1 , j ,cuts , dp);
            min = Math.min(min , costs);
        }
        
        return dp[i][j] = min;
    }
}