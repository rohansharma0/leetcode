class Solution {
    public int numDecodings(String s) {
        
        int n = s.length();
        
        int[] dp = new int[n];
        
        Arrays.fill(dp , -1);
        
        return solve(0 , s , dp);
        
    }
    
    public int solve(int i  , String s , int[] dp){
        
        if(i == s.length()) return 1;
        
        if(dp[i] != -1) return dp[i];
        
        int l = 0 , r = 0;
        
        if(s.charAt(i) - '0' > 0){
            l = solve(i+1 , s , dp);
        }
        
        if(i+1 < s.length() && s.charAt(i) != '0'){
            
            int x = (s.charAt(i) - '0') * 10 +( s.charAt(i+1) - '0');
            
            if(x > 0 && x <= 26){
                r = solve(i+2 , s , dp);
            }
           
        }
        
        return dp[i] = l + r;
        
    }
}