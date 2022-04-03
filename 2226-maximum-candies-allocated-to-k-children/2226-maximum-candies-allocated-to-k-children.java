class Solution {
    public int maximumCandies(int[] candies, long k) {
        
        long s = 0;
        for(int e : candies) s += e;
        
        if(s < k) return 0;
        
        long i = 1;
        long j = s;
        
        long ans = 0;
        while(i <= j){
            
            long mid = i + (j-i)/2;
            
            if(solve(candies , mid) >= k){
                ans = mid;
                i = mid+1;
            }else{
                j = mid-1;
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