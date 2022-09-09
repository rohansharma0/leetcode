class Solution {
    
    public static String[] data = {"" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
    
    public List<String> letterCombinations(String n) {
        
        
        List<String> ans = new ArrayList<>();
        
        if(n.length()==0)return ans;
        
        solve(0 , n , "" , ans);
        
        return ans;
    }
    
    public void solve(int idx , String n , String psf , List<String> ans){
        
        if(idx == n.length()){
            ans.add(psf);
            return;
        }
        
        int digit = n.charAt(idx) - '0';
        
        for(char c : data[digit].toCharArray()){
            
            solve(idx+1 , n , psf + c , ans);
            
        }
        
        
    }
}