class Solution {
    public String convertToTitle(int n) {
        
        StringBuilder ans = new StringBuilder();
        
        while(n > 0){
            char tmp = (char)((n%26==0?26:n%26)+64);
            ans.append(tmp);
            n =(n%26==0? n/26-1: n/26);
        }
        
        return ans.reverse().toString();
        
    }
}