class Solution {
    public int missingNumber(int[] nums) {
        int ans = 0;
        for(int e : nums){
            ans = ans ^ e;
        }
        
        for(int i = 0 ; i <=nums.length ;i++){
            ans = ans ^ i;
        }
        
        return ans;
    }
}