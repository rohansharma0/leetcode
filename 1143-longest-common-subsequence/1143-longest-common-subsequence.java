class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int n1 = text1.length();
        int n2 = text2.length();
        
        int[][] dp = new int[n1][n2];
        
        for(int[] x : dp){
            Arrays.fill(x , -1);
        }
        
        
        return solve(n1-1 , n2-1 , text1 , text2 , dp);
        
    }
    
    public int solve(int i , int j , String s , String t , int[][] dp){
        
        if(i < 0 || j < 0) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        if(s.charAt(i) == t.charAt(j)){
            return dp[i][j] = 1 + solve(i-1 , j-1 , s, t , dp);
        }
        
        return dp[i][j] = Math.max(solve(i-1 ,j, s , t , dp) , solve(i , j-1 , s , t , dp));
        
    }
}