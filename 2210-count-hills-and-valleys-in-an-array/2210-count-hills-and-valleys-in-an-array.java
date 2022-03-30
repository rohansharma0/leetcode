class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        
        List<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i< n-1 ; i++){
            if(nums[i] != nums[i+1]) arr.add(nums[i]);
        }
        
        arr.add(nums[n-1]);
        int c = 0;
        
        for(int i = 1 ; i< arr.size()-1 ; i++){
            if((arr.get(i) > arr.get(i-1) && arr.get(i) > arr.get(i+1)) || 
               (arr.get(i) < arr.get(i-1) && arr.get(i) < arr.get(i+1))){
                c++;
            }
        }
        return c;
    }
}