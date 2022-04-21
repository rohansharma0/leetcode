class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int[] ans = new int[n];
        int[] lp = new int[n];
        int[] rp = new int[n];
        
        lp[0] = nums[0];
        for(int i = 1 ; i< n ; i++){
            lp[i] = nums[i] * lp[i-1];
        }
        
        rp[n-1] = nums[n-1];
        for(int i = n-2 ; i>= 0 ; i--){
            rp[i] = nums[i] * rp[i+1];
        }
        ans[0] = rp[1];
        ans[n-1] = lp[n-2];
        for(int i = 1; i< nums.length-1 ; i++){
            ans[i] = lp[i-1];
            ans[i] = ans[i] * rp[i+1];
        }
        return ans;
    }
}