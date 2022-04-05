class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        
        int[] next = new int[n+1];
        
        for(int i = n-1 ; i>= 0 ; i--){
            
            int[] curr = new int[n+1];
            
            for(int pi = i-1 ; pi>= -1 ; pi--){
                
                int pick = 0;
                if(pi == -1 || nums[i] > nums[pi]){
                    pick = next[i+1] + 1;    
                }

                int notPick = next[pi+1];

                curr[pi+1] = Math.max(pick , notPick);
                
            }
            
            next = curr;
            
        }
        
        
        return next[0];
    }
}