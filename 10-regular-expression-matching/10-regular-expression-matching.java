class Solution {
    public boolean isMatch(String s, String p) {
        
        int n = s.length();
        int m = p.length();
        
        return solve(n-1 , m-1 , s, p);
    }
    public boolean solve(int i , int j , String s , String p){
        
        if(j<0) return (i<0);
        
        if(i<0) return (p.charAt(j) == '*') && solve(i,j-2,s,p);
        
        
        
        if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') return solve(i-1 , j-1 , s , p);
        
        
        if(p.charAt(j) == '*'){

            if(s.charAt(i) == p.charAt(j-1) || p.charAt(j-1) == '.') return solve(i-1 , j , s , p) || solve(i , j-2 , s ,p);
            
            return solve(i , j-2 , s ,p);
        }
        
        return false;
        
    }
}