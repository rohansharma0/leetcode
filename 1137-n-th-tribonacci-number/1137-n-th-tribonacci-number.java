class Solution {
    public int tribonacci(int n) {
        if(n == 0 || n == 1) return n;
        int prev = 1;
        int prev2 = 1;
        int prev3 = 0;
        
        for(int i = 3 ; i<= n ; i++){
            int c = prev + prev2 + prev3;
            
            prev3 = prev2;
            prev2 = prev;
            prev = c;
        }
        
        return prev;
    }
}