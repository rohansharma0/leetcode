class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        
        for(int[] acc : accounts){
            int s = 0;
            for(int e : acc){
                s+=e;
            }
            max = Math.max(s , max);
        }
        
        return max;
    }
}