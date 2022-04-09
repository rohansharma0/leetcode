class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n+1];
        
        dp[n] = 1;
        
        for(int i = n-1 ; i>= 0 ; i--){
            
            int l = 0;
            if(s.charAt(i)-'0' > 0){
                l = dp[i+1];
            }
            int r = 0;
            if(i < n-1 && s.charAt(i) != '0'){
                int x = (s.charAt(i)-'0') * 10 + (s.charAt(i+1)-'0');

                if(x > 0 && x <= 26){
                    r = dp[i+2];
                }
            }

            dp[i] = l + r;
            
        }
        return dp[0];
    }
    
}