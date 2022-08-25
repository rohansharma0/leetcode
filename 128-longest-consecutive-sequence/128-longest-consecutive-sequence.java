class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int e : nums){
            hs.add(e);
        }
        
        int ans = 0;
        for(int i = 0 ; i< nums.length ; i++ ){
            
            if(!hs.contains(nums[i] - 1)){
                int c = 0;
                int x = nums[i];
                
                while(hs.contains(x)){
                    c++;
                    x++;
                }
                ans = Math.max(ans , c);
            }
            
        }
        
        return ans;
        
    }
}