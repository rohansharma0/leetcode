class Solution {
    public int minInsertions(String s) {
        
        int n = s.length();
        
        
        return n - lps(s);
        
    }
    
    
    public int lps(String s){
        
        StringBuilder s2 = new StringBuilder(s);
        s2.reverse();
        
        int n = s.length();
        
        int dp[][] = new int[n+1][n+1];
        
        int max = 0;
        
        for(int i = 1 ; i<= n ; i++){
            for(int j = 1 ; j<= n ; j++){
                
                if(s.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] +1;
                    max = Math.max(dp[i][j] , max);
                }else{
                    dp[i][j] = Math.max(dp[i][j-1] , dp[i-1][j]);
                }
                
            }
        }
        
        return max;
    }
}