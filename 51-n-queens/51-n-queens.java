class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        char[][] board = new char[n][n];
        
        for(char[] x : board){
            Arrays.fill(x , '.');
        }
        List<List<String>> ans = new ArrayList<>();
        f(0,board,n , ans);
        return ans;
    }
    
    
    
    public boolean check(char[][] board,int row,int col){
        
        for(int i = row , j = col ; j>=0 ;j--){
            if(board[i][j] == 'Q') return false;
        }
        
        for(int i=row , j=col ; i>=0 && j>=0 ; j-- , i--){
            if(board[i][j] == 'Q') return false;
        }
        for(int i=row , j=col ; i<board.length && j>=0 ; j-- ,i++){
            if(board[i][j] == 'Q') return false;
        }
        
        return true;
    }
    
    public void f(int col,char[][] board,int n , List<List<String>> ans) {
        
        if(col==n){
            //[.q..] -> [".q.."
            //[...q] -> "...q"
            //[q...] -> "q..."
            //[..q.] -> "..q."]
            //convert to string
            List<String> ds = new ArrayList<>();
            
            for(char[] x : board){
                String y = new String(x);
                ds.add(y);
            }
            //add to ans
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int row=0;row<n;row++){
            
            if(check(board,row,col)){
                board[row][col] = 'Q';
                
                f(col+1,board,n , ans);
                
                board[row][col] = '.';
            }
        }
        
    }
}