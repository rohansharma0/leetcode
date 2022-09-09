class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> ans = new ArrayList<>();
        
        solve(0 , n , n , n , ans , "");
        
        return ans;
    }
    
    public void solve(int i , int on , int cn , int n , List<String> ans , String psf){
        
        if(i == 2*n){
            if(on == cn){
                if(check(psf)) ans.add(psf);
            }
            return;
        }
        
        
        solve(i+1 , on - 1 , cn ,n, ans , psf + "(");
        solve(i+1 , on  , cn - 1,n, ans , psf + ")");

    }
    
    public boolean check(String s){
        
        Stack<Character> st = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c == '(') st.push(c);
            else {
                if(st.size() > 0 && st.peek() == '(') st.pop();
                else return false;
            }
        }
        
        return st.size() == 0;
    }
}