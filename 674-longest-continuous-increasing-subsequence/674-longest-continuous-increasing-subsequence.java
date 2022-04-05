class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        int ans = 1;
        
        int i = 0;
        
        int j = 1;
        
        while(j < nums.length){
            
            if(nums[j] > nums[j-1]){
                ans = Math.max(ans , (j - i + 1));
            }else{
                i = j;
            }
            
            j++;
            
        }
        
        return ans;
    }
}