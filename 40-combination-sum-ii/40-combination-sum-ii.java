class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int tar) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(nums);
        
        solve(0 , nums , tar , new ArrayList<>() , ans);
        
        return ans;
    }
    
    public void solve(int idx , int[] nums , int tar , List<Integer> ds , List<List<Integer>> ans){
        
        if(tar == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i = idx ; i< nums.length ; i++){
            if(i > idx && nums[i] == nums[i-1]) continue;
            
            if(nums[i] > tar) break;

            ds.add(nums[i]);
            solve(i+1 , nums , tar - nums[i] , ds , ans);
            ds.remove(ds.size()-1);
            
        }
    }
    
}