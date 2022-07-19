class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int e : nums){
            if(map.containsKey(e)){
                map.put(e , map.get(e) +1);
            }else{
                map.put(e , 1);
            }
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        
        int n = nums.length;
        
        solve(map , new ArrayList<>() , ans , n);
        
        return ans;
    }
    
    public void solve(HashMap<Integer , Integer> map , List<Integer> ds , List<List<Integer>> ans , int n){
        
        if(ds.size() == n){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(Integer key : map.keySet()){
            
            if(map.get(key) <= 0) continue;
            
            ds.add(key);
            map.put(key , map.get(key)-1);
            
            solve(map , ds , ans , n);
            
            ds.remove(ds.size()-1);
            map.put(key , map.get(key)+1);
            
        }
        
    }
}