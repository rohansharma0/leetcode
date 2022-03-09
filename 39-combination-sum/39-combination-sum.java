class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int tar) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        solve(0 , nums , tar , new ArrayList<>() ,ans);
        
        return ans;
        
    }
    
    public void solve(int i , int[] nums , int tar ,List<Integer> ds ,  List<List<Integer>> ans){
        
        if(i == nums.length ) return;
        
        if(tar == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        if(tar < 0) return;
        
        //pick
        ds.add(nums[i]);
        solve(i , nums , tar - nums[i] , ds , ans);
        
        ds.remove(ds.size()-1);
        solve(i+1 , nums , tar , ds , ans);
    }
    
}