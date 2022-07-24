class Solution {
    public int getMaximumGold(int[][] grid) {
        
        int max = 0;
        
        for(int i = 0 ; i < grid.length ; i++){
            
            for(int j = 0 ; j < grid[0].length ; j++){
                
                if(grid[i][j] != 0){
                    
                    boolean[][] vis = new boolean[grid.length][grid[0].length];
                    
                    int[] m = new int[1];
                    
                    solve(i , j , vis , grid , 0 , m);
                    
                    max = Math.max(max , m[0]);
                    
                }
                
            }
            
        }
    
        return max;
        
        
    }
    
    
    public void solve(int i , int j ,boolean[][] vis , int[][] arr , int sum , int[] max){
        
        if(i < 0 || j < 0 || i>=arr.length || j >= arr[0].length || vis[i][j] == true || arr[i][j] == 0){
            if(sum > max[0]){
                max[0] = sum;
            }
            return;
        }
        
        
        vis[i][j] = true;
        
        solve(i+1 , j , vis , arr, sum + arr[i][j] , max);
        solve(i-1 , j , vis , arr, sum + arr[i][j] , max);
        solve(i , j+1 , vis , arr, sum + arr[i][j] , max);
        solve(i , j-1 , vis , arr, sum + arr[i][j] , max);

        vis[i][j] = false;
        
    }
}