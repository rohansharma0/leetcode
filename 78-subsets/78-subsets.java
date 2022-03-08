class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    
        List<List<Integer>> ans = new ArrayList<>();
        
        getSubsets(0 , nums , new ArrayList<>(), ans);
        
        return ans;
        
    }
    
    public void getSubsets(int idx , int[] nums , List<Integer> ds , List<List<Integer>> ans){
        
        if(idx == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[idx]);
        getSubsets(idx+1 , nums , ds , ans);
        ds.remove(ds.size()-1);
        getSubsets(idx+1 , nums , ds , ans);
    }
}