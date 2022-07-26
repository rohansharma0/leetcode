class Solution {
    public int uniquePathsIII(int[][] grid) {
        
        int sr = 0;
        int sc = 0;
        int nZ = 0;
        
        for(int i = 0; i< grid.length ; i++){
            for(int j = 0 ; j< grid[0].length ; j++){
                
                if(grid[i][j] == 0){
                    nZ++;
                }
                
                if(grid[i][j] == 1){
                    sr = i;
                    sc = j;
                }
                
            } 
        }
        
        return solve(sr , sc , nZ , grid);
    }
    
    public int solve(int sr , int sc , int nZ , int[][] grid){
       
        
        if(sr < 0 || sc < 0 || sr >= grid.length || sc >= grid[0].length || grid[sr][sc] == -1){
            return 0;
        }
        if(grid[sr][sc] == 2){
            if(nZ == -1) return 1;
            else return 0;
        }
        
        grid[sr][sc] = -1;
        nZ--;
        
        int a1 = solve(sr + 1 , sc, nZ , grid);
        int a2 = solve(sr - 1 , sc, nZ , grid);
        int a3 = solve(sr, sc + 1 , nZ , grid);
        int a4 = solve(sr, sc - 1 , nZ , grid);
        
        grid[sr][sc] = 0;
        nZ++;
        
        return a1 + a2 + a3 + a4;
        
    }
}