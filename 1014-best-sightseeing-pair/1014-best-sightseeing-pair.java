class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n = values.length;
        
        int mx = values[0];
        int ans = -1;
        for(int i = 1 ; i< n ; i++){
            ans = Math.max(ans , mx + values[i] - i);
            mx = Math.max(values[i] + i , mx);
            
        }
        
        
        return ans;
    }
}