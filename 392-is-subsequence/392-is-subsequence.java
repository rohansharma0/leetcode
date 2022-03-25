class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        
        boolean[] prev = new boolean[m+1];
        
        for(int j = 0; j<= m ; j++){
            prev[j] = true;
        }
        
        for(int i = 1 ; i<= n ; i++){
            boolean[] curr = new boolean[m+1];
            for(int j = 1 ; j<= m ; j++){
                
                if(s.charAt(i-1) == t.charAt(j-1)){
                    curr[j] = prev[j-1];
                }else{
                    curr[j] = curr[j-1];
                }
            }
            prev = curr;
        }
        
        return prev[m];
    }
    
}