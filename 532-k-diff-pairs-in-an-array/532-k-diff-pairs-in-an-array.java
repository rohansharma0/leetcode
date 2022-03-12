class Solution {
    public int findPairs(int[] nums, int k) {
     
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int e : nums){
            if(map.containsKey(e)){
                map.put(e , map.get(e) +1);
            }else{
                map.put(e , 1);
            }
        }
        
        int ans = 0;
        
        if(k == 0){
            
            for(int key : map.keySet()){
                if(map.get(key) > 1) ans++;
            }
            
            return ans;
        }
        
        for(int key : map.keySet()){
            int d = key + k;
            if(map.containsKey(d)) ans++;
        }
        
        return ans;
    }
}