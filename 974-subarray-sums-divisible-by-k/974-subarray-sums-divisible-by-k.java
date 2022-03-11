class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int n = nums.length;
        int c = 0;
        
        HashMap<Integer , Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0 , 1);
        for(int i = 0; i< n ; i++){
            sum += nums[i];
            
            int r = sum % k;
            if(r < 0) r+= k;
            if(map.containsKey(r)){
                c += map.get(r);
                map.put(r , map.get(r) + 1);
            }else{
                map.put(r , 1);
            }
            
        }
        
        return c;
    }
}