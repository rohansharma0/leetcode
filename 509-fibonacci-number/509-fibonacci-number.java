class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        int prev = 1;
        int prev2 = 0;
        
        for(int i = 2 ; i<= n ; i++){
            int x = prev2 + prev;
            
            prev2 = prev;
            prev = x;
        }
        
        return prev;
    }
}