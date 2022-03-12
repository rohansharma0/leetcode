class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> res = new ArrayList<>();
        
        if(nums.length == 1) return res;
        
        for(int i = 0; i< nums.length ; i++){
            int el = Math.abs(nums[i]) - 1;
            
            if(nums[el] < 0){
                res.add(el+1);
            }else{
                nums[el] = -1 * nums[el];
            }
        }
        
        return res;
    }
}