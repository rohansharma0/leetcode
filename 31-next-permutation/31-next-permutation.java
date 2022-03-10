class Solution {
    public void nextPermutation(int[] nums) {
        
        int n = nums.length;
        
        if(n <= 1 || nums == null) return;
        
        int i = n-2;
        
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        
        if(i >= 0){
            int j = n-1;
        
            for(j = n-1 ; j>= 0 ; j--){
                if(nums[i] < nums[j]){
                    break;
                }
            }

            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
        
        reverse(nums , i+1, n-1);
        
    }
    
    public void reverse(int[] nums , int i , int j){
        
        while(i < j){
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        
        }
        
    }
}