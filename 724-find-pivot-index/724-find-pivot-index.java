class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        
        for(int e : nums){
            sum += e;
        }
        int l = 0;
        int r = sum;
        
        for(int i = 0 ; i< nums.length ; i++){
            
            r = r - nums[i];
            
            if(l == r) return i;
            
            l = l + nums[i];
        }
        
        return -1;
    }
}