class Solution {
    public int maxFrequency(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        int n = nums.length;

        long[] preSum = new long[n];
        
        preSum[0] = nums[0];
        
        for(int i = 1 ; i< n ; i++){
            preSum[i] = preSum[i-1] + nums[i];
        }
        
        int ans = 1;
        
        for(int i = n-1 ; i>= 0 ; i--){
            
            int l = 0;
            int r = i;
            
            while(l <= r){
                
                int m = r - (r - l)/2;
                
                long sum = preSum[i] - (m > 0 ? preSum[m - 1] : 0);
                if(sum + k >= nums[i] * 1L * (i-m+1)){
                    
                    ans = Math.max(ans , (i-m+1));
                    r = m -1;
                }else{
                    l = m + 1;
                }
                
                
            }

        }
        
        return ans;
        
    }
}