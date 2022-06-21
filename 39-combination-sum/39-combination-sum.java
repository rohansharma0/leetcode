class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        solve(0 , target , candidates , new ArrayList<>() , ans);
        
        return ans;
    }
    public void solve(int i , int tar , int[] nums , List<Integer> ds , List<List<Integer>> ans){
        
        
        if(tar == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        
        if(i >= nums.length) return;
        
        //notTake
        solve(i+1 , tar , nums , ds , ans);
        
        //take
        if(nums[i] <= tar){
            ds.add(nums[i]);
            solve(i , tar - nums[i] , nums , ds , ans);
            ds.remove(ds.size()-1);
        
        }
        
    }
}