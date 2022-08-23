class Solution {
    public boolean isMatch(String s, String p) {
        
        int n = p.length();
        int m = s.length();
        
        int[][] dp = new int[n][m];
        
        for(int[] x : dp){
            Arrays.fill(x , -1);
        }
        
        return solve(n-1 , m-1 , p , s , dp);
    }
    
    public boolean solve(int i , int j , String s , String t , int[][] dp){
        
        if(i < 0 && j < 0) return true;
        
        if(i < 0 && j >= 0) return false;
        
        
        if(j < 0 && i>= 0){
            for(int x = 0 ; x <= i ; x++) if(s.charAt(x) != '*') return false;
            
            return true;
        }
        
        if(dp[i][j] != -1) return dp[i][j] == 1;
        
        
        if(s.charAt(i) == t.charAt(j) || s.charAt(i) == '?'){
            if(solve(i-1 , j-1 , s , t , dp)){
                dp[i][j] = 1;
                return true;
            }
            dp[i][j] = 0;
            return false;
        }
        
        if(s.charAt(i) == '*'){
            if(solve(i-1 , j , s , t , dp) || solve(i , j-1 , s , t , dp)){
                dp[i][j] = 1;
                return true;
            }
            dp[i][j] = 0;
            return false;
        }
        dp[i][j] = 0;
        return false;
        
    }
}