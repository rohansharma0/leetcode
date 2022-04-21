class Solution {
    public int rob(int[] nums) {
        
        if(nums.length == 1) return nums[0];
        
        int[] nums1 = new int[nums.length-1];
        int[] nums2 = new int[nums.length-1];
        
        int x = 0;
        int y = 0;
        for(int i = 0 ; i< nums.length; i++){
            if(i != 0) nums2[y++] = nums[i];
            if(i != nums.length - 1) nums1[x++] = nums[i];
           
        }
        
        return Math.max(robSolve(nums1) , robSolve(nums2));
    }
    
    public int robSolve(int[] nums) {
        int n = nums.length;
        
        int prev = nums[0];
        int prev2 = 0;
        
        for(int i = 1 ; i < n ; i++){
            int notTake = prev;
            int take = nums[i];
            if(i > 1){
                take += prev2 ;
            }

            int curr = Math.max(take , notTake);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}