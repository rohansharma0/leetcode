class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        return solve(n-1 , m-1 , s , t);
    }
    
    public boolean solve(int i , int j , String s , String t){
        
        if(i < 0) return true;
        if(j < 0 && i>= 0) return false;
        
        if(s.charAt(i) == t.charAt(j)) return solve(i-1 , j-1 , s, t);
        
        return solve(i , j-1 , s , t);
    }
}