class Solution {
    public int findLongestChain(int[][] pairs) {
        
        Arrays.sort(pairs , (a , b) -> a[1] - b[1]);
        
        int n = pairs.length;
        
        
        int ans = 1;
        int et = pairs[0][1];
        
        for(int i = 1 ; i< n ; i++){
            
            if(pairs[i][0] > et){
                ans++;
                et = pairs[i][1];
            }
            
        }
        
        return ans;
        
    }
    
}