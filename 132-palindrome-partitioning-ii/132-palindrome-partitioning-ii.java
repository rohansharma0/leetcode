class Solution {
    public int minCut(String s) {
        
        int n = s.length();
        
        int[] dp = new int[n];
        
        Arrays.fill(dp , -1);
        
        return solve(0 , s , dp)-1;
        
    }
    
    public int solve(int idx, String s , int[] dp){
        
        if(idx == s.length()) return 0;
        
        if(dp[idx] != -1) return dp[idx];
        
        int min = Integer.MAX_VALUE;
        
        for(int i = idx ; i < s.length() ; i++){
            
            if(ispalindrome(s , idx , i)){
                int res = 1 + solve(i+1 , s , dp);
                
                min = Math.min(min , res);
            }
            
        }
        
        return dp[idx] = min;
    }
    
    public boolean ispalindrome(String s , int i , int j){
        
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        
        return true;
        
    }
}