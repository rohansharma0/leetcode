class Solution {
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        
        for(int i = 0 ; i< n ; i++){
            for(int j = 0; j< m ; j++){
                if(board[i][j] == 0){
                    solve(board , i , j);
                }else{
                    solve(board , i , j);
                }
            }
        }
        for(int i = 0 ; i< n ; i++){
            
            for(int j = 0; j< m ; j++){
                
                if(board[i][j] == -1){
                    board[i][j] = 0;
                }else if(board[i][j] == -2){
                    board[i][j] = 1;
                }
                
            }
        }
        
    }
    
    public void solve(int[][] board , int i , int j){
        
        int n = board.length;
        int m = board[0].length;
        
        int n1 = 0;
        int cnt = 0;
        
        if(i-1 >= 0){
            cnt++;
            if(Math.abs(board[i-1][j]) == 1) n1++;
        }
        if(i-1 >= 0 && j+1 < m){
            cnt++;
            if(Math.abs(board[i-1][j+1]) == 1) n1++;
        }
        if(i+1 < n){
            cnt++;
            if(Math.abs(board[i+1][j]) == 1) n1++;
        }
        if(i+1 <n && j+1 < m){
            cnt++;
            if(Math.abs(board[i+1][j+1]) == 1) n1++;
        }
        if(j+1 < m){
            cnt++;
            if(Math.abs(board[i][j+1]) == 1) n1++;
        }
        if(i+1 <n  && j-1 >=0){
            cnt++;
            if(Math.abs(board[i+1][j-1]) == 1) n1++;
        }
        if(j-1 >= 0){
            cnt++;
            if(Math.abs(board[i][j-1]) == 1) n1++;
        }
        if(i-1 >= 0 && j-1 >=0){
            cnt++;
            if(Math.abs(board[i-1][j-1]) == 1) n1++;
        }
        int n0 = cnt - n1;
        
        if(board[i][j] == 1){
            
            if(n1 < 2 || n1 > 3){
                //0
                board[i][j] = -1;
            }
        }else{
            
            if(n1 == 3){
                //1
                board[i][j] = -2;
            }
            
        }
    }
}