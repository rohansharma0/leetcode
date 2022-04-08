class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        Pair[] pairs = new Pair[mat.length];
        
        for(int i = 0; i< mat.length;  i++){
            
            int[] row = mat[i];
            //upper bound index
            int idx = binS(row , 1);
            
            pairs[i] = new Pair(i , (idx + 1));
        }
        
        
        Arrays.sort(pairs , (a , b) -> (a.et - b.et));
        
        int[] ans = new int[k];
        
        for(int i = 0 ; i<  k ; i++){
            ans[i] = pairs[i].st;
        }
        
        return ans;
        
    }
    
    public int binS(int[] row , int k){
        
        int i = 0;
        int j = row.length-1;
        
        while(i <= j){
            
            int m = i + (j - i) /2;
            
            if(row[m] < k){
                j = m-1;
            }else{
                i = m+1;
            }
            
        }
        
        return i;
    }
    
}

class Pair{
    int st;
    int et;
    
    Pair(int st , int et){
        this.st = st;
        this.et = et;
    }
}