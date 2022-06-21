class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(candidates);
        
        solve(0 , target , candidates , new ArrayList<>() , ans);
        
        return ans;
    }
    
    public void solve(int i , int tar , int[] nums , List<Integer> ds , List<List<Integer>> ans){
        
        
        if(tar == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        
        if(i >= nums.length) return;
        
        
        //take
        if(nums[i] <= tar){
            ds.add(nums[i]);
            solve(i+1, tar - nums[i] , nums , ds , ans);
            ds.remove(ds.size()-1);
        
        }
        
        while(i+1 < nums.length && nums[i] == nums[i+1]) i++;
        
        //notTake
        solve(i+1 , tar , nums , ds , ans);
        
    }
}