class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3) return false;
        
        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;
        int k = Integer.MAX_VALUE;
        
        for(int e : nums){
            if(e <= i){
                i = e;
            }else if(e <= j){
                j = e;
            }else return true;
        }
        
        return false;
    }
}