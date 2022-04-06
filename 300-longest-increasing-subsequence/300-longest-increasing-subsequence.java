class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        
        List<Integer> arr = new ArrayList<>();
        
        arr.add(nums[0]);
        
        for(int i = 1; i< n ; i++){
            
            if(nums[i] > arr.get(arr.size()-1)){
                arr.add(nums[i]);
            }else{
                
                int idx = lowerBound(arr , nums[i]);
                arr.set(idx , nums[i]);

            }
        }
        
        return arr.size();
        
    }
    
    public int lowerBound(List<Integer> arr , int k){
        
        int s = 0;
        int e = arr.size()-1;
        
        while(s <= e){
            
            int m = s + (e - s) / 2;
            
            if(arr.get(m) < k){
                s = m+1;
            }else{
                e = m-1;
            }
            
        }
        
        return s;
    }
}