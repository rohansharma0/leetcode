class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max = 0;
        
        for(int i = 0; i< nums1.length ; i++){
            
            int s = i;
            int e = nums2.length-1;
            
            while(s <= e){
                int m = s + (e - s) / 2;
                
                if(nums2[m] >= nums1[i]){
                    s = m+1;
                }else{
                    e = m-1;
                }
            }
            
            int d = e - i;
            
            max = Math.max(d , max);
            
        }
        
        return max;
    }
}