class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        
        Arrays.sort(nums);
        
        int n = nums.length;
        
        int[] dp = new int[n];
        int[] hash = new int[n];
        
        Arrays.fill(dp , 1);
        
        int max = 1;
        int lastI = 0;
        
        for(int i = 0 ; i< n ; i++){
            
            hash[i] = i;
            
            for(int j = 0 ; j < i  ; j++){
                
                if(nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1){
                    dp[i] = dp[j] + 1;
                    hash[i] = j;
                }
                
            }
            
            if(dp[i] > max){
                max = dp[i];
                lastI = i;
            }
            
        }
        
        List<Integer> ans = new ArrayList<>();
        ans.add(nums[lastI]);
        
        while(hash[lastI] != lastI){
            lastI = hash[lastI];
            ans.add(nums[lastI]);
        }
        
        Collections.reverse(ans);
        return ans;
    }
}