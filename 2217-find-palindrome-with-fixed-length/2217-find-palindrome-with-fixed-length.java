class Solution {
    public long[] kthPalindrome(int[] queries, int intLength) {
        
        int pw = intLength % 2 == 0 ? (intLength / 2 - 1) : (intLength / 2);
        int start = (int)Math.pow(10 , pw);
        
        int n = queries.length;
        long[] ans = new long[n];
        
        for(int i = 0; i< n ; i++){
            int q = queries[i];
            
            String res = (start + q -1) + "";
            StringBuilder rev = new StringBuilder((start + q -1) + "");
            rev.reverse();
            
            if(intLength % 2 == 0){
                res = res +  rev.toString();
            }else{
                res = res +  rev.substring(1).toString();
            }
            if(res.length() == intLength) 
                ans[i] = Long.parseLong(res);
            else ans[i] = -1;
        }
        
        return ans;
    }
}