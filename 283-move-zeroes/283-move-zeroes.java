class Solution {
    public void moveZeroes(int[] nums) {
        
        if(nums.length == 1) return;
        
        int i = 0;
        int j = 0;
        
        while(j < nums.length){
            if(nums[j] == 0) j++;
            else{
                int t = nums[j];
                nums[j] = nums[i];
                nums[i] = t;
                i++;
                j++;
            }
        }
    }
}