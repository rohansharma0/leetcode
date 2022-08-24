class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int c = 0;
        int n = nums.length;
        
        int[] pre = new int[n+1];
        pre[0] = 0;
        
        for(int i = 1 ; i<= n ; i++){
            pre[i] = pre[i-1] + nums[i-1];
        }
        
        for(int i = 0 ; i<=n ; i++){
            
            for(int j = i+1 ; j <=n ; j++){
                
                if(pre[j] - pre[i] == k)c++;
                
            }
        }
        
        return c;
        
    }
}