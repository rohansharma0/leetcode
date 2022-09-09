class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> ans = new ArrayList<>();
        
        solve(0 , 0 , n , ans , "");
        
        return ans;
    }
    
    public void solve(int on , int cn , int n , List<String> ans , String psf){
        
        if(psf.length() == 2*n){
            ans.add(psf);
            return;
        }
        
        if(on < n) solve(on+1 , cn ,n, ans , psf + "(");
        if(cn < on) solve(on  , cn +1,n, ans , psf + ")");

    }
   
}