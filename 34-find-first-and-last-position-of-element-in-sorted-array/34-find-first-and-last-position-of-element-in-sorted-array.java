class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = new int[2];
        
        if(nums.length == 0){
            ans[0] = -1;
            ans[1] = -1;
            
            return ans;
        } 
        
        int l = 0;
        int r = nums.length-1;
        
        int fi = -1;
        
        while(l <= r){
            
            int m = l + (r - l) / 2;
            
            if(nums[m] > target){
                r = m-1;
            }else if(nums[m] < target){
                l = m+1;
            }else{
                fi = m;
                r = m-1;
            }
            
        }
        
        l = 0;
        r = nums.length-1;
        
        int li = -1;
        
        while(l <= r){
            
            int m = l + (r - l) / 2;
            
            if(nums[m] > target){
                r = m-1;
            }else if(nums[m] < target){
                l = m+1;
            }else{
                li = m;
                l = m+1;
            }
            
        }
        
        ans[0] = fi;
        ans[1] = li;
        
        return ans;
        
        
    }
}