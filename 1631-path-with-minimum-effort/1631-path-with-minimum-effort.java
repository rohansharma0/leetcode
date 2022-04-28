class Solution {
    
    int[] dir = new int[]{0 , 1 , 0 , -1 , 0};
    
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        
        int[][] eff = new int[n][m];
        
        for(int[] x : eff){
            Arrays.fill(x , Integer.MAX_VALUE);
        }
        eff[0][0] = 0;
        
        PriorityQueue<int[]> que = new PriorityQueue<>((a , b) -> (a[0] - b[0]));
        
        que.offer(new int[]{0 , 0 , 0});
        
        while(que.size() > 0){
            
            int[] node = que.poll();
            int x = node[1];
            int y = node[2];
            int curEff = node[0];
            
            if(x == n-1 && y == m-1){
                return curEff;
            }
            
            for(int k = 0 ; k< 4 ; k++){
                int newX = x + dir[k];
                int newY = y + dir[k+1];
                
                if(newX >= 0 && newX < n && newY >= 0 && newY < m){
                     int newEff = Math.max(curEff , Math.abs(heights[x][y] - heights[newX][newY]));
                    
                    if(newEff < eff[newX][newY]){
                        eff[newX][newY] = newEff;
                        que.offer(new int[]{newEff , newX , newY});
                    }
                    
                }
                
            }
            
        }
        
        
        return 0;
    }
}
