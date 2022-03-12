class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> res = new ArrayList<>();
        
        if(nums.length == 1) return res;
        
        for(int i = 0; i< nums.length ; i++){
            int idx = Math.abs(nums[i]) - 1;
            
            if(nums[idx] < 0){
                res.add(Math.abs(nums[i]));
            }else{
                nums[idx] = -1 * nums[idx];
            }
        }
        
        return res;
    }
}