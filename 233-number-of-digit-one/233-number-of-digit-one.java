class Solution {
    public int countDigitOne(int n) {
        String s = Integer.toString(n);
        return solve(n , s.length());
    }
    
    public int solve(int n , int len){
        
        if(n < 1) return 0;
        
        if(len == 1) return 1;
        
        int pow = (int)Math.pow(10 , len-1);
        
        int msd = n / pow;
        
        if(msd == 0) return solve(n % pow , len-1);
        
        return (msd == 1 ? n % pow + 1 : pow ) + solve(n % pow , len-1) + msd * solve(pow - 1 , len -1);
        
    }
}