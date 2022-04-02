class Solution {
    public boolean isPerfectSquare(int n) {
       
        long i = 0;
        long j = n;
        
        
        while(i <= j){
            
            long mid = (i+j)/2;
            
            if(mid * mid == n){
                return true;
            }else if(mid * mid > n){
                j = mid - 1;
            }else{
                i = mid + 1;
            }
            
        }
        
        return false;
    }
}