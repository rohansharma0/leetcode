class Solution {
    
    static int MOD = (int)1e9+7;
    
    public int countGoodNumbers(long n) {
        
        long o = n / 2;
        
        long e = n / 2 + (n % 2);
        
        //5^e * 4^o;
        
        long eans = binexp(5 , e);
        
        long oans = binexp(4 , o);
        
        return (int)((eans % MOD * oans % MOD) % MOD);
    
    }
    
    public long binexp(long a , long b){
        
        if(b == 0) return 1;
        
        long x = binexp(a , b / 2);
        
        if((b & 1) == 0){
            return ((x % MOD) * (x % MOD)) % MOD;
        }
        
        return ((a % MOD) * (x % MOD) * (x % MOD)) % MOD;
        
    }
    
}