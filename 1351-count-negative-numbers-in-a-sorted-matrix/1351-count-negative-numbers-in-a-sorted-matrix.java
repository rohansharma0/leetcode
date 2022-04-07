class Solution {
    public int countNegatives(int[][] grid) {
        
        int c = 0;
        
        for(int[] row : grid){
            
            int s = 0;
            int e = row.length-1;
            
            while(s <= e){
                int m = s + (e - s) / 2;
                
                if(row[m] < 0){
                    e = m-1;
                }else{
                    s = m+1;
                }
            }
            
            c = c + (row.length - s);

        }
        
        return c;
        
    }
}