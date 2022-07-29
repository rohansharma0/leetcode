class Solution {
    public int maximumSum(int[] nums) {
        
        Arrays.sort(nums);
        Map<Integer , List<Integer>> map = new HashMap<>();
        
        for(int e : nums){
            
            int s = digitSum(e);
            List<Integer> x;
            if(map.containsKey(s)){
                x = map.get(s);
            }else{
                x = new ArrayList<>();
            }
            
            x.add(e);
            map.put(s , x);
            
        }
        int ans = -1;
        
        for(int s : map.keySet()){
            if(map.get(s).size() > 1){
                List<Integer> x = map.get(s);
                ans = Math.max(ans , x.get(x.size()-1) + x.get(x.size()-2));
            }
        }
        
        return ans;
    }
    
    public int digitSum(int n){
        
        int sum = 0;
        while(n > 0){
            sum += (n % 10);
            n = n / 10;
        }
        return sum;
        
    }
}