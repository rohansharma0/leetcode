class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        
        return solve(n);
    }
    
    public int solve(int n){
        if(n == 0) return 1;
        int x = 9;
        int mul = 9;
        for(int i = 0 ; i< n-1 ; i++){
            x = x * mul;
            mul--;
        }
        return solve(n-1) + x;
    }
}