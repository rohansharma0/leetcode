class Solution {
    public int majorityElement(int[] nums) {
        
        int el = 0;
        int c = 0;
        
        for(int e : nums){
            
            if(c == 0){
                el = e;
            }
            if(el == e){
                c+=1;
            }else{
                c-=1;
            }
            
        }
        
        return el;
        
    }
}