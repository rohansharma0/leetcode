class Solution {
    public void sortColors(int[] nums) {
        
        int i = 0;
        int j = 0;
        int k = nums.length-1;
        
        // i --- j --- k
        
        while(j <= k){
            
            if(nums[j] == 0){
                int t = nums[j];
                nums[j] = nums[i];
                nums[i] = t;
                i++;
                j++;
            }else if(nums[j] == 1){
                j++;
            }else{
                
                int t = nums[k];
                nums[k] = nums[j];
                nums[j] = t;
                k--;
                
            }
        }
        
    }
}