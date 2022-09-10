class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        HashSet<String> hs = new HashSet<>();
        
        for(String word : wordDict){
            hs.add(word);
        }
        
        int[] dp = new int[s.length()];
        
        Arrays.fill(dp , -1);
        
        return solve(0 , s , hs , dp);
        
    }
    
    public boolean solve(int st , String s , HashSet<String> hs , int[] dp){
        if(st == s.length()) return true;
        
        if(dp[st] != -1) return (dp[st] == 1); 
                  
        for(int i = st+1; i<=s.length() ; i++){
            if(hs.contains(s.substring(st , i))){
                
                if(solve(i , s , hs , dp)){
                    dp[st] = 1;
                    return true;
                }
                
            }
            
        }
        
        dp[st] = 0;
        
        return false;
        
    }
    
}