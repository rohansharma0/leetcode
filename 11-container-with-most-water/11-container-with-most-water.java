class Solution {
    public int maxArea(int[] height) {
        
        int ans = 0;
        int i = 0;
        int j = height.length-1;
        
        while(i < j){
            
            int area = (j - i) * Math.min(height[i] , height[j]);
            ans = Math.max(ans , area);
            
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
            
        }
        
        return ans;
    }
}