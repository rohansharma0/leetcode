class Solution {
    public int arraySign(int[] nums) {
        int nZ = 0;
        int nN = 0;
        
        for(int e : nums){
            if(e == 0){
                nZ++;
            }
            if(e < 0){
                nN++;
            }
        }
        
        if(nZ > 0) return 0;
        if(nN % 2 == 0) return 1;
        return -1;
    }
}