class Solution {
    public int maxProfit(int k, int[] prices) {
        
        int n = prices.length;
        
        int[][] prev= new int[2][k+1];
        
        
        for(int i = n-1 ; i>= 0 ; i--){
            
            int[][] curr = new int[2][k+1];
            
            for(int j = 0 ; j < 2; j++){
                
                for(int cap  = 1 ; cap <=k ; cap++){
                    
                    int profit = 0;
        
                    if(j == 1){

                        profit =  Math.max(prev[0][cap] - prices[i] ,prev[1][cap]);

                    }else{

                       profit =  Math.max(prev[1][cap-1] + prices[i] , prev[0][cap]); 
                    }

                    curr[j][cap] = profit;
                }
                
            }
            
            prev = curr;
        }
        
        return prev[1][k];
    }
}