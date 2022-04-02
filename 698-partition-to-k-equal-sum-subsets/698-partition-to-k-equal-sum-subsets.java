class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        
        if(nums.length < k) return false;
        int maxe = 0;
        int sum = 0;
        
        for(int e : nums){
            maxe = Math.max(maxe , e);
            sum += e;
        }
        if(sum % k != 0) return false;
        
        int subSum = sum / k;
        
        if(maxe > subSum) return false;
        
        boolean[] vis = new boolean[nums.length];
        
        return canPartition(nums , 0 , k , 0 , subSum , vis);
        
    }
    
    public boolean canPartition(int[] nums , int st , int k , int curSum , int tarSum , boolean[] vis){
        
        if(k == 0) return true;
        if(curSum > tarSum) return false;
        if(curSum == tarSum)  return canPartition(nums , 0 , k-1 , 0 , tarSum , vis);
        
        for(int i = st ; i< nums.length ; i++){
            if(vis[i]) continue;
            vis[i] = true;
            if(canPartition(nums , i+1 , k , curSum + nums[i] , tarSum , vis)) return true;
            vis[i] = false;
        }
        
        return false;
        
    }
    
    
}