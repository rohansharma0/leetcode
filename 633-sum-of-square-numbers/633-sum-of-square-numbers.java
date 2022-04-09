class Solution {
    public boolean judgeSquareSum(int c) {
        
        long i = 0;
        long j = (long)Math.sqrt(c);
        
        while(i <= j){
            long x = i*i + j*j;
            if(x == c){
                return true;
            }else if(x > c){
                j--;
            }else{
                i++;
            }
            
        }
        
        return false;
        
    }
}