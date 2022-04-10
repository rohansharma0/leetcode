class Solution {
    
    public int maximumProduct(int[] nums, int k) {
        
        int mod = (int)(1e9+7);
        
        PriorityQueue<Integer> minH = new PriorityQueue<>();
        
        for(int e : nums){
            minH.add(e);
        }
        
        while(k != 0){
            int x = minH.remove();
            minH.add(x+1);
            k--;
        }
        
        long ans = 1;
        
        while(minH.size() > 0){
            ans = (ans * minH.remove()) % mod;
        }
        
        return (int)ans;
        
    }
}