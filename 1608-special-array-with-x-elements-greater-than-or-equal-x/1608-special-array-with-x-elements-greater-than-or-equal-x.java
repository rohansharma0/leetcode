class Solution {
    public int specialArray(int[] nums) {
        
        int s = 1;
        int e = 1000;
        
        while(s <= e){
            
            int m = s + (e - s) / 2;
            
            int cnt = 0;
            
            for(int i : nums){
                if(i >= m)cnt++;
            }
            
            if(m == cnt){
                return m;
            }else if(m > cnt){
                e = m-1;
            }else{
                s = m+1;
            }
            
        }
        
        return -1;
        
    }
}