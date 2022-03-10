class Solution {
    public boolean exist(char[][] board, String word) {
        
        int n = board.length;
        int m = board[0].length;
        for(int i = 0 ; i< n ; i++){
            
            for(int j = 0 ; j< m ; j++){
                if(board[i][j] == word.charAt(0)){
                    
                    boolean[][]vis = new boolean[n][m];
                    
                    if(solve(board , i , j , n ,m , vis, word)) return true;
                }
                
            }
            
        }
        
        return false;
    }
    
    public boolean solve(char[][] board , int i , int j, int n ,int m, boolean[][] vis , String word){
        
        
        
        if(i < 0 || j < 0 || j >= m || i>= n || vis[i][j] == true || word.length() <= 0 || word.charAt(0) != board[i][j]){
            return false;
        }
        
        if(word.length() == 1 && vis[i][j] == false){
            if(board[i][j] == word.charAt(0))return true;
            return false;
        }
        vis[i][j] = true;
        String res = word.substring(1);
        boolean t = solve(board , i - 1 , j , n ,m,vis, res);
        boolean r = solve(board , i , j + 1 , n ,m,vis, res);
        boolean b = solve(board , i + 1 , j , n ,m,vis, res);
        boolean l = solve(board , i , j - 1 , n ,m,vis, res);
        vis[i][j] = false;
        
        return t || r || b || l;
        
    }
}