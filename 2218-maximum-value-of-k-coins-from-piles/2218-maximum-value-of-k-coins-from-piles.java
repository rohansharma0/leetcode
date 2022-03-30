class Solution {
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        
        int n = piles.size();
        
        int[][] dp = new int[n][k+1];
        
        for(int[] x : dp){
            Arrays.fill(x , -1);
        }
        
        return solve(0 , k , piles , dp);
    }
    
    public int solve(int i , int k , List<List<Integer>> arr , int[][] dp){
        
        if(i == arr.size() || k == 0) return 0;
        
        if(dp[i][k] != -1) return dp[i][k];
        
        int best = solve(i+1 , k , arr , dp);
        
        int sum = 0;
        for(int j = 0 ; j< Math.min(k , arr.get(i).size()) ; j++){
            
            sum += arr.get(i).get(j);
            
            best = Math.max(best , solve(i+1, k-(j+1) , arr , dp) + sum);
        }
        
        return dp[i][k] = best;
    }
}