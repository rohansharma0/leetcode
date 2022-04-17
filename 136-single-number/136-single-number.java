class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int e : nums){
            xor = xor ^ e;
        }
        return xor;
    }
}