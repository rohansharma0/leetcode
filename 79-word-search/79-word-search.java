class Solution {
    public boolean exist(char[][] board, String word) {
        
        int n = board.length;
        int m = board[0].length;
        
        for(int i = 0 ; i< n ; i++){
            
            for(int j = 0 ; j < m ; j++){
                
                if(board[i][j] == word.charAt(0)){
                    
                    int[][] vis = new int[n][m];
                    
                    if(solve(board , word , 0 , i , j , vis)) return true;
                    
                }
                
            }
            
        }
        
        return false;
    }
    
    public boolean solve(char[][] board , String word , int idx , int i , int j , int[][] vis){
        if(idx >= word.length()) return true;
        
        if(i < 0 || j < 0 || i>= board.length || j >= board[0].length || vis[i][j] == 1) return false;
        
        
        if(word.charAt(idx) != board[i][j]) return false;
        
        vis[i][j] = 1;
        
        boolean t = solve(board , word , idx+1 , i+1 , j , vis);
        boolean d = solve(board , word , idx+1 , i-1 , j , vis);
        boolean l = solve(board , word , idx+1 , i , j+1 , vis);
        boolean r = solve(board , word , idx+1 , i , j-1 , vis);
        
        vis[i][j] = 0;
        
        return t || d || l || r;
    }
}