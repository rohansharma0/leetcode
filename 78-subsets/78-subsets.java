class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    
        List<List<Integer>> res = new ArrayList<>();
        
        solve(0 , nums , new ArrayList<>() , res);
        
        return res;
    }
    
    
    public void solve(int i , int[] nums , List<Integer> ds , List<List<Integer>> res){
        
        if(i == nums.length){
            res.add(new ArrayList<>(ds));
            return;
        }
        
        //pick
        ds.add(nums[i]);
        solve(i+1 , nums , ds , res);
        
        ds.remove(ds.size()-1);
        
        //not pick
        solve(i+1 , nums , ds , res);
        
    }
}