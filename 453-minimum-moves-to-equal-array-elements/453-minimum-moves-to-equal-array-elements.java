class Solution {
    public int minMoves(int[] nums) {
        
        Arrays.sort(nums);
        int ans = 0;
        for(int i = nums.length -1 ; i>= 1 ; i--){
            ans += nums[i] - nums[0];
        }
        
        return ans;
    }
}