class Solution {
    public long zeroFilledSubarray(int[] nums) {
        
        int[] pre = new int[nums.length];
        
        for(int i = 0; i< nums.length; i++){
            
            if(nums[i] == 0){
                if(i == 0){
                    pre[i] = 1;
                }else{
                    pre[i] = pre[i-1]+1;
                }
            }else{
                pre[i] = 0;
            }
            
        }
        long ans = 0;
        
        for(int e : pre){
            ans += e;
        }
        
        return ans;
        
    }
   
}