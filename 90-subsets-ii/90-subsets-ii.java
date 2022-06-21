class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        
        solve(0 , nums , new ArrayList<>() , ans);
        
        return ans;
    }
    
    public void solve(int i , int[] nums , List<Integer> ds , List<List<Integer>> ans){
        
        if(i == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        //take
        ds.add(nums[i]);
        solve(i+1 , nums , ds , ans);
        ds.remove(ds.size()-1);
        
        //notTake
        while(i+1 < nums.length && nums[i] == nums[i+1]) i++;
        solve(i+1 , nums , ds , ans);
    }
}