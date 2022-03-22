class Solution {
    public boolean isMatch(String s, String p) {
        
        int n = s.length();
        int m = p.length();
        
        int[][] dp = new int[n+1][m+1];
        
        for(int[]x : dp ){
            Arrays.fill(x , -1);
        }
        return solve(n , m , s, p , dp);
    }
    public boolean solve(int i , int j , String s , String p , int[][] dp){
        
        if(j==0) return (i==0);
        
        if(i==0) return p.charAt(j-1) == '*' && solve(i,j-2,s, p , dp);
            
        if(dp[i][j] != -1) return (dp[i][j] == 1);
        
        boolean ans = false;
        
        //simple char matching
        //if s char matchs with p char or it can be '.'
        if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '.'){
            ans = solve(i-1 , j-1 , s , p , dp);
        }
        
        //if char is '*' 
        else if(p.charAt(j-1) == '*'){
            
            //if s char matchs with p char or it can be '.'
            if(s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.'){
                
                //using * we can take one char or we can ignore *
                ans = ans || solve(i-1 , j , s , p , dp);

            }
            
            // if s char not match with p char
            ans = ans || solve(i , j-2 , s , p , dp);
           
        }
        
        dp[i][j] = ans ? 1 : 0;
        
        return ans;
    }
}