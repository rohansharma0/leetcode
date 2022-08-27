class Solution {
    public int longestStrChain(String[] words) {
        
        int n = words.length;
        
        int[] dp = new int[n];
        Arrays.sort(words , (a , b) -> a.length() - b.length());
        Arrays.fill(dp , 1);
        
        int max = 1;
        
        for(int i = 0 ; i< n ; i++){
            
            
            for(int j = 0 ; j < i ; j++){
                
                if(compare(words[i] , words[j]) && dp[i] < dp[j] + 1){
                    
                    dp[i] = dp[j] + 1;
                    
                }
                
            }
            
            max = Math.max(max , dp[i]);
            
        }
        
        return max;
    }
    
    public boolean compare(String s , String t){
        
        if(s.length() != t.length() + 1) return false;
        
        int i = 0;
        int j = 0;
        
        while(i < s.length()){
            
            if(j < t.length() && s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
            
        }
        
        if(i == s.length() && j == t.length()) return true;
        return false;
    }
}