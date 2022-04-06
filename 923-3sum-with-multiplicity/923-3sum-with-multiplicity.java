class Solution {
    public int threeSumMulti(int[] arr, int target) {
        
        int mod = (int)1e9+7;
        
        int n = arr.length;
        
        long ans = 0;
        
        
        for(int i = 0; i< n ; i++){
            
            int[] count = new int[101];
            for(int j = i+1 ; j< n ; j++){
                
                int k = target - arr[i] - arr[j];
                
                if(k >= 0 && k <= 100 && count[k] > 0){
                    ans += count[k];
                    ans = ans % mod;
                }
                
                count[arr[j]]++;
            }
            
            
        }
        
        return (int)ans;
        
    }
}