class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i = 0 ; i< nums.length-2; i++){
            
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                
                int j = i+1;
                int k = nums.length-1;
                
                int tar = -1 * nums[i];
            
                while(j < k){
                    if(nums[j] + nums[k] > tar){
                        k--; 
                    }else if(nums[j] + nums[k] < tar){
                        j++;
                    }else{
                        List<Integer> t = new ArrayList<>();

                        t.add(nums[i]);
                        t.add(nums[j]);
                        t.add(nums[k]);

                        ans.add(new ArrayList<>(t));
                        
                        while(j < k && nums[j] == nums[j+1])j++;
                        while(j < k && nums[k] == nums[k-1])k--;
                        j++;
                        k--;
                        
                    }
                }
            }
        }
        
        return ans;
    }
}