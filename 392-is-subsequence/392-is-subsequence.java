class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length() == 0) return true;
        if(t.length() == 0) return false;

        
        int i = 0;
        int j = 0;
        
        while(j < t.length() && t.charAt(j) != s.charAt(i)) j++;
        
        while(i < s.length() && j < t.length()){
            
            if(t.charAt(j) == s.charAt(i)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        
        if(i == s.length()) return true;
        return false;
        
    }
}