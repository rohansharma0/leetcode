class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int max_s = Integer.MIN_VALUE;
        int s = 0;
        int min_s = Integer.MAX_VALUE;
        int t_max = 0;
        int t_min = 0;
        
        for(int e : nums){
            t_max += e;
            
            max_s = Math.max(max_s , t_max);
            if(t_max < 0){
                t_max = 0;
            }
            
            t_min += e;
            
            min_s = Math.min(min_s , t_min);
            if(t_min > 0){
                t_min = 0;
            }
            
            s += e;
        }
        
        if(s == min_s) return max_s;
        
        return Math.max(max_s , s - min_s);
        
    }
}