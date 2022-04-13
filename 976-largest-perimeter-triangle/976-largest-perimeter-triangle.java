class Solution {
    public int largestPerimeter(int[] nums) {
        
        Arrays.sort(nums);
        int ans = 0;
        
        for(int i = nums.length-2 ; i>= 1 ; i--){
            if(nums[i] + nums[i-1] > nums[i+1] && nums[i-1] + nums[i+1] > nums[i] && nums[i] + nums[i+1] > nums[i-1]){
                int peri = nums[i-1] + nums[i] + nums[i+1];
                ans = Math.max(peri , ans);
            }
        }
        
        return ans;
        
    }
}