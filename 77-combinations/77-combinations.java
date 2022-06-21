class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        solve(1 , new ArrayList<>() , ans , n , k);
        
        return ans;
    }
    
    public void solve(int i , List<Integer> ds , List<List<Integer>> ans , int n , int k){
        
       
        if(ds.size() == k){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        if(i > n) return;
        
        //take
        ds.add(i);  
        solve(i+1 , ds , ans , n , k);
        ds.remove(ds.size()-1);
        
        //notTake
        solve(i+1 , ds , ans , n , k);
    }
}