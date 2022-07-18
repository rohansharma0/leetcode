class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> ds = new ArrayList<>();
        
        solve(0 , ds, candidates , target , ans);
        
        return ans;
    }
    
    
    public void solve(int idx , List<Integer> ds , int[] nums , int tar , List<List<Integer>> ans ){
        
        if(tar == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i = idx ; i < nums.length ; i++){
                        
            if(i != idx && nums[i] == nums[i-1]) continue;

            if(nums[i] > tar) break;
            
            ds.add(nums[i]);
            solve(i+1 , ds , nums , tar - nums[i] , ans);
            ds.remove(ds.size()-1);

        }
        
    }
}