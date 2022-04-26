class Solution {
    public String longestPalindrome(String s) {
        char[] sc = s.toCharArray();
        int n = s.length();
        
        boolean[][] dp = new boolean[n][2];
        
        int curCol = 0;
        int maxLen = 0;
        int ans = 0;
        
        for(int len  = 0 ; len < n ; len++){
            for(int st = 0 ; st + len < n ; st++){
                
                int et = st + len;
                
                if(len == 0){
                    dp[st][curCol] = true;
                }else if(len == 1){
                    dp[st][curCol] = (sc[st] == sc[et]);
                }else {
                    dp[st][curCol] = (sc[st] == sc[et] && dp[st + 1][curCol]);
                }
                
                if(dp[st][curCol] && len + 1 > maxLen){
                    ans = st;
                    maxLen = len + 1;
                }
            }
            
            curCol = 1 - curCol;
        }
        
        return maxLen == 0 ? "" : s.substring(ans , ans + maxLen);
    }
    
}