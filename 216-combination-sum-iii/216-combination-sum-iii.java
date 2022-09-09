class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        solve(1 , new ArrayList<>() , k , n , ans);
        
        return ans;
    }
    
    public void solve(int st , List<Integer> ds , int k , int n , List<List<Integer>> ans){
        
        if(ds.size() > k) return;
        
        if(ds.size() == k && n == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i = st ; i <= n && i <= 9 ; i++){

            ds.add(i);
            solve(i+1 , ds , k , n - i, ans);
            ds.remove(ds.size()-1);
        
        }
    }
}