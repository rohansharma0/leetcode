class Solution {
    public double average(int[] salary) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int e : salary){
            sum += e;
            min = Math.min(min , e);
            max = Math.max(max , e);
        }
        
        
        sum -= (min + max);
        
        return sum * 1.0 /(salary.length -2);
    }
}