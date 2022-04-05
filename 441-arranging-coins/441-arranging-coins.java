class Solution {
    public int arrangeCoins(int n) {
        
        if(n == 1) return 1;
        
        long s = 0;
        long e = n;
        
        while(s <= e){
            
            long m = s+ (e-s) /2;
            
            if(m*(m+1)/2 > n){
                e = m-1;
            }else{
                s = m+1;
            }
            
        }
        
        return (int)e;
    }
}