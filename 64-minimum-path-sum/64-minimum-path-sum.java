class Solution {
    public int minPathSum(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;
        
        int[] prev= new int[m];
        
        for(int i = 0; i< n ; i++){
            
            int[] curr = new int[m];
            
            for(int j = 0 ; j<m ; j++){
                
                if(i == 0 && j == 0) curr[j] = grid[i][j];
                else{
                    int top = (int)1e8 , left = (int)1e8;
                    
                    if(j> 0) top = curr[j-1];
                    if(i> 0) left= prev[j];
                    
                    curr[j] = Math.min(top  , left) + grid[i][j];
                }
                
            }
            prev = curr;
        }
        
        return prev[m-1];
        
    }
}