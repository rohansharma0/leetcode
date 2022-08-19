class Solution {
    public int subarraysDivByK(int[] nums, int k) {
     
        int s = 0;
        
        int[] freq = new int[k];
        
        for(int e : nums){
            s += (e % k + k) % k;
            freq[s % k]++;
        }
        
        int ans = freq[0];
        
        for(int e : freq){
            ans += (e * (e-1) / 2);
        }
        
        return ans;
    }
}