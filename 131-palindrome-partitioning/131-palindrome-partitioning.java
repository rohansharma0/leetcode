class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>> ans = new ArrayList<>();
        
        solve(0 , new ArrayList<>() , s , ans);
        
        return ans;
    }
    
    public void solve(int st , List<String> ds , String s , List<List<String>> ans){
        
        if(st == s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        
        for(int et = st ; et < s.length() ; et++){
            
            
            if(isPalindrome(s , st , et)){
                
                ds.add(s.substring(st , et+1));
                
                solve(et+1 , ds , s , ans);
                
                ds.remove(ds.size()-1);
                
            }
            
        }
        
    }
    
    public boolean isPalindrome(String s , int i , int j){
        
        while(i < j){
            
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
            
        }
        
        return true;
        
    }
}