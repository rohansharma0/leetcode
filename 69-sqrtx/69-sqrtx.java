class Solution {
    public int mySqrt(int x) {
        
        long y = 1;
        
        while(y * y <= x) y++;
        
        return (int)y-1;
        
    }
}