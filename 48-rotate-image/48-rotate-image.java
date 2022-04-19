class Solution {
    public void rotate(int[][] matrix) {
        //transpose
        
        for(int i = 0 ; i< matrix.length; i++){
            for(int j = i+1 ; j< matrix.length; j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        
        //reverse row wise
        
        for(int i = 0; i< matrix.length ; i++){
            
            int j = 0;
            int k = matrix.length - 1;
            
            while(j < k){
                int t = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = t;
                j++;
                k--;
            }
            
        }
        
    }
}