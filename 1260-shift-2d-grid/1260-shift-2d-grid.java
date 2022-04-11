class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        List<Integer> nums = new ArrayList<>();
        
        for(int i = 0; i< grid.length ; i++){
            for(int j = 0 ; j< grid[0].length ; j++){
                nums.add(grid[i][j]);
            }
        }
        
        rotateArray(nums , k);
        
        List<List<Integer>> res = new ArrayList<>();
        int idx = 0;
        for(int i = 0; i< grid.length ; i++){
            res.add(new ArrayList<>());
            for(int j = 0 ; j< grid[0].length ; j++){
                res.get(i).add(nums.get(idx++));
            }
        }
        
        return res;
        
    }
    public void rotateArray(List<Integer> nums , int k){
        
        k = k % nums.size();
        
        reverse(nums , 0 , nums.size() - k -1);
        reverse(nums , nums.size() - k , nums.size()-1);
        reverse(nums , 0 , nums.size()-1);
    }
    
    
    public void reverse(List<Integer> nums , int i , int j){
        while(i < j){
            int temp = nums.get(i);
            nums.set(i , nums.get(j));
            nums.set(j , temp);
            i++;
            j--;
        }
    }
}