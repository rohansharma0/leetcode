class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        
        int[] prev = new int[2];
        
        prev[0] = prev[1] = 0;
        
        for(int i = n-1 ; i>= 0 ; i--){
            
            int[] curr = new int[2];
            
            for(int buy = 0 ; buy <= 1 ; buy++){
                int profit = 0;
                if(buy == 1){
                    profit = Math.max(prev[0] - prices[i] ,prev[1]);
                }else{
                    profit =  Math.max(prev[1] + prices[i] , prev[0]);
                }

                curr[buy] = profit;
                
            }
            
            prev = curr;
            
        }
        
        return prev[1];
    }
    
}