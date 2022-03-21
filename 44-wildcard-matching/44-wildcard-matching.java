class Solution {
    public boolean isMatch(String s, String p) {
        
        int n = s.length();
        int m = p.length();
        
        int[][] dp = new int[n][m];
        
        for(int[] x : dp){
            Arrays.fill(x , -1);
        }
        
        return solve(n-1 , m-1 , s ,p , dp);
    }
    
    public boolean solve(int i , int j , String s , String p , int[][] dp){
        
        if(i < 0 && j < 0) return true; 
        
        if(j < 0 && i>= 0) return false;
        
        if(i < 0 && j>= 0){
            
            for(int ii = 0 ; ii<= j ; ii++){
                if(p.charAt(ii) != '*') return false;
            }
            
            return true;
        }
        
        if(dp[i][j] != -1) return (dp[i][j] == 1);
        
        
        if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '?'){
            
            if(solve(i-1 , j-1 , s, p , dp)){
                dp[i][j] = 1;
                return true;
            }
            dp[i][j] = 0;
            return false;
        }
        
        if(p.charAt(j) == '*'){
            
            if(solve(i-1 , j ,s ,p , dp) || solve(i , j-1 , s , p , dp)){
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