class Solution {
    public int minCut(String s) {
        
        int n = s.length();
        
        int[] dp = new int[n+1];
        
        dp[n] = 0;
        
        for(int i = n-1 ; i >= 0 ; i--){
            
            int min = Integer.MAX_VALUE;
        
            for(int j = i ; j < n ; j++){

                if(ispalindrome(s , i , j)){
                    int res = 1 + dp[j+1];
                    min = Math.min(min , res);
                }

            }
            dp[i] = min;
            
        }
        
        return dp[0]-1;
        
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