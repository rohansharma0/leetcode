class Solution {
    public int[][] generateMatrix(int n) {
        int [][] ans = new int[n][n];
        
        int minr = 0;
        int minc = 0;
        
        int maxr = n-1;
        int maxc = n-1;
        
        int tne = n * n;
        
        int c = 1;
        
       
        while(c <= tne){
            //top wall
            for(int i = minr , j = minc ; j<= maxc && c<=tne ; j++){
                ans[i][j] = c;
                c++;
            }
            minr++;
            //right wall
            for(int i = minr , j = maxc ; i<= maxr && c<=tne ; i++){
                  ans[i][j] = c;
                c++;
            }
            maxc--;
            //bottom wall
            for(int i = maxr , j = maxc ; j>= minc  && c<=tne ; j--){
                 ans[i][j] = c;
                c++;
            }
            maxr--;
            //left wall
            for(int i = maxr , j = minc ; i>= minr && c<=tne ; i--){
                 ans[i][j] = c;
                c++;
            }
            minc++;
        }

        return ans;
    }
}