class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        int prev2 = 0;
        int prev = 0;
        
        for(int i = 2 ; i<= n ; i++){
            
            int f1 = prev + cost[i-1];
            int f2 = prev2 + cost[i-2];
            
            int curr = Math.min(f1 , f2);
            prev2 = prev;
            prev = curr;
        }
        
        return prev;
    }
 
}