class Solution {
    public int change(int amt, int[] coins) {
        
        int n = coins.length;
        
        int[]prev = new int[amt+1];
        
        for(int j = 0 ; j<= amt ; j++){
            if(j % coins[0] == 0) prev[j] = 1;
        }
        
        for(int i = 1 ; i< n ; i++){
            int[]curr = new int[amt+1];
            for(int j = 0 ; j<=amt ; j++){
                
                //nottake
                int nottake = prev[j];

                //take
                int take = 0;

                if(coins[i] <= j){
                    take = curr[j - coins[i]];
                }

                curr[j] = nottake + take;
                
            }
            prev = curr;
        }
        
        return prev[amt];
    }
}