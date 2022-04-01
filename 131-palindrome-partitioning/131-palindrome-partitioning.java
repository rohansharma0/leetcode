class Solution {
    public List<List<String>> partition(String s) {
       
        List<List<String>> res = new ArrayList<>();
        
        solve(0 , s , new ArrayList<>() , res);
        
        return res;
    }
    
    public void solve(int idx , String s , List<String> ds , List<List<String>> res){
        
        if(idx == s.length()){
            res.add(new ArrayList<>(ds));
            return;
        }
        
        
        for(int i = idx ; i < s.length() ; i++){
            
            if(isPalindrome(s , idx , i)){
                
                ds.add(s.substring(idx , i+1));
                solve(i+1 ,s , ds , res);
                ds.remove(ds.size()-1);
            }
            
        }
    }
    
    public boolean isPalindrome(String s , int i , int j){
        
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        
        return true;
        
    }
    
}