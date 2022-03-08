class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        getCombination(1 , n , k , new ArrayList<>() , ans);
        
        return ans;
    }
    
    public void getCombination(int idx , int n , int k , List<Integer> ds , List<List<Integer>> ans){
        
        if(ds.size() == k){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i = idx ; i<= n ; i++){
            ds.add(i);
            getCombination(i+1 , n , k , ds, ans);
            ds.remove(ds.size()-1);
        }
        
        
    }
    
}