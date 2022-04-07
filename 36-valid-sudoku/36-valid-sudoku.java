class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        
        for(int i = 0 ; i< 9 ; i++){
            for(int j = 0 ; j< 9 ; j++){
                
                if(board[i][j] != '.'){
                    char n = board[i][j];    
                    if(seen.contains(n + "_R_" + i) ||
                       seen.contains(n + "_C_" + j) ||
                       seen.contains(n + "_B_" + i / 3 + "-" + j/3) 
                      ){
                        return false;
                    }else{
                        
                        seen.add(n + "_R_" + i);
                        seen.add(n + "_C_" + j);
                        seen.add(n + "_B_" + i / 3 + "-" + j/3);
                    }
                }
                
            }
        }
        
        return true;
    }
}