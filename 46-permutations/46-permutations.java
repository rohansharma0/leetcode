class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        solve( nums , new ArrayList<>() , ans);
        
        return ans;
       
    }
    
    public void solve(int[] nums , List<Integer> ds , List<List<Integer>> ans){
        
        if(nums.length == ds.size()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        
        for(int i = 0; i< nums.length ; i++){
            if(!ds.contains(nums[i])){
                ds.add(nums[i]);
                solve(nums , ds , ans);
                ds.remove(ds.size()-1);
            }
        }
    }
    
}