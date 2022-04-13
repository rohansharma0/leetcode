class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
   
        int min = Integer.MAX_VALUE;
        int ans = -1;
        
        for(int i = 0 ; i< points.length ; i++){
            
            if(points[i][0] == x || points[i][1] == y){
                int md = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                if(md < min){
                    min = md;
                    ans = i;
                }
            }
        }
        
        if(min == Integer.MAX_VALUE){
            return -1;
        }
        
        return ans;
    }
}