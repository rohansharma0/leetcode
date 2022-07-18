class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        
        solve(0 , new ArrayList<>() , nums , ans);
        return ans;
    }
    
    public void solve(int i , List<Integer> ds , int[] nums , List<List<Integer>> ans ){
        
        if(i == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        ds.add(nums[i]);
        solve(i+1 , ds , nums , ans);
        ds.remove(ds.size()-1);
        
        while(i+1 < nums.length && nums[i] == nums[i+1]) i++;
        solve(i+1 , ds , nums , ans);
        
        
    }
   
}