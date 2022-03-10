class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<>();
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int sr = 0 , sc = 0 , er = n -1 , ec = m-1;
        
        int tno = n * m;
        
        int cnt = 0;
        
        while(cnt < tno){
            
            //top
            for(int i = sr , j = sc ; j<= ec && cnt < tno ; j++){
                ans.add(matrix[i][j]);
                cnt++;
            }
            sr++;
            
            //right
            for(int i = sr , j = ec ; i<= er && cnt < tno ; i++){
                ans.add(matrix[i][j]);
                cnt++;
            }
            ec--;
            
            //bottom
            for(int i = er , j = ec ; j>= sc && cnt < tno ; j--){
                ans.add(matrix[i][j]);
                cnt++;
            }
            er--;
            
            //left
            for(int i = er , j = sc ; i>= sr && cnt < tno ; i--){
                ans.add(matrix[i][j]);
                cnt++;
            }
            sc++;
        }
        
        return ans;
    }
}