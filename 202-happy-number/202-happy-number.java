class Solution {
    public boolean isHappy(int n) {
        int s = solve(n);
        int f = solve(solve(n));
        
        while(s != f){
            
            s = solve(s);
            f = solve(solve(f));
            
        }
        
        return s == 1;
    }
    
    public int solve(int n){
        
        int ans = 0;
        while(n != 0){
            int r = n % 10;
            n = n / 10;
            ans += (r * r);
        }
        return ans;
    }
}