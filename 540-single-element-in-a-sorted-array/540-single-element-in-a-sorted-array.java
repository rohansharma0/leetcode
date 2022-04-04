class Solution {
    public int singleNonDuplicate(int[] nums) {
        int xor = 0;
        
        for(int e : nums){
            xor = xor ^ e;
        }
        return xor;
    }
}