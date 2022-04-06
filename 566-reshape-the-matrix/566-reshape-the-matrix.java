class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int n = mat.length;
        int m = mat[0].length;
        
        if(n * m != r * c){
            return mat;
        }
        
        if(n == r && m == c) return mat;
        
        int[][] arr = new int[r][c];
        
        int x = 0;
        int y = 0;
        
        for(int i = 0; i< mat.length ; i++){
            
            for(int j = 0 ; j < mat[0].length ; j++){
                
                if(y >= c){
                    x++;
                    y=0;
                }
                
                arr[x][y++] = mat[i][j];
            }
            
        }
        return arr;
        
    }
}