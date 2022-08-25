class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int e : nums){
            if(e < 0) neg.add(e);
            else pos.add(e);
        }
        int a = 0;
        int b = 0;
        for(int i = 0 ; i< nums.length ; i++){
            if(i % 2 == 0){
                nums[i] = pos.get(a++);
            }else{
                nums[i] = neg.get(b++);
            }
        }
        
        return nums;
    }
}