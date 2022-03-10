class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(nums);
        
        int n = nums.length;
        
        for(int i = 0; i< n-3 ; i++){
            
            for(int j = i+1 ; j < n - 2 ; j++){
                
                int li = j+1;
                int ri = n-1;
                
                int temp = target - nums[i] - nums[j];
                
                while(li < ri){
                    
                    int twoSum = nums[li] + nums[ri];
                    
                    if(twoSum < temp){
                        li++;
                    }else if(twoSum > temp){
                        ri--;
                    }else{
                        
                        List<Integer> arr = new ArrayList<>();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[li]);
                        arr.add(nums[ri]);
                        ans.add(arr);
                        
                        while(li < ri && nums[li] == arr.get(2)) ++li;
                        
                        while(li < ri && nums[ri] == arr.get(3)) --ri;
                        
                    }
                    
                }
                
                while(j + 1 < n && nums[j+1] == nums[j]) ++j;
                 
            }
        
            while(i + 1 < n && nums[i+1] == nums[i]) ++i;
            
        }
        
        return ans;
        
    }
}