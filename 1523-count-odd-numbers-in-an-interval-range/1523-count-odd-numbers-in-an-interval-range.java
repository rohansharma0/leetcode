class Solution {
    public int countOdds(int low, int high) {
        int c = high - low  + 1;
        
        if(c % 2 == 0){
            return c / 2;
        }
        if(high % 2 == 0) return c / 2;
        return c/2 + 1;
    }
}