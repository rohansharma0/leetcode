class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
       
        List<List<Integer>> ans = new ArrayList<>();
        
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i = 0; i< nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i])+1);
            }else{
                map.put(nums[i] , 1);
            }
        }
        
        
        solve(map ,nums.length, new ArrayList<>() , ans);
        
        return ans;
        
    }
    
    
    public void solve(HashMap<Integer , Integer> map ,int n , List<Integer> ds , List<List<Integer>> ans){
        
        if(ds.size() == n){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int key : map.keySet()){
            if(map.get(key) > 0){
                ds.add(key);
                map.put(key , map.get(key) - 1);
                solve(map ,n, ds , ans);
                ds.remove(ds.size()-1);
                map.put(key , map.get(key) + 1);
            }
            
        }
        
    }
    
}