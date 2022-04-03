class Solution {
    public int maximumCandies(int[] candies, long k) {
        
        long s = 0;
        for(int e : candies) s += e;
        
        long i = 0;
        long j = s / k;
        j++;
        long ans = 0;
        
        while(i < j){
            
            long mid = i + (j-i)/2;
            
            if(mid == 0) return 0;
            
            if(solve(candies , mid) >= k){
                ans = Math.max(ans , mid);
                i = mid+1;
            }else{
                j = mid;
            }
            
        }
        return (int)ans; 
        
    }
    
    public long solve(int[] nums , long x){
        
        long c = 0;
        
        for(int e : nums){
            c += (e / x);
        }
        
        return c;
    }
}