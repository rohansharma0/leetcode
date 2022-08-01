class Solution {
    public int rob(int[] nums) {
       
        int n = nums.length;
        
        int prev2 = 0 , prev = 0;
        
        for(int i = 0 ; i < n ; i++){
            
            int take = nums[i];
            
            if(i-2 >= 0){
                take += prev2;
            }
            
            int notTake = 0;
  
            if(i-1 >= 0){
                notTake += prev;
            }
            
            int curr = Math.max(take , notTake);
            prev2 = prev;
            prev = curr;
            
        }
        
        return prev;
        
    }
    
}