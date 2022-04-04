class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int i = 0;
        int j = nums.length-2;
        
        while(i <= j){
            
            int m = i + (j-i)/2;
            if(nums[m] !=  nums[m ^ 1]){
                j = m-1;
            }else{
                i = m+1;
            }
        }
        
        return nums[i];
    }
}