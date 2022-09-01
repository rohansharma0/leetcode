class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        
        
        int n1 = -1;
        int n2 = -1;
        
        int c1 = 0;
        int c2 = 0;
        
        for(int e : nums){
            
            if(e == n1) c1++;
            else if(e == n2) c2++;
            else if(c1 == 0){
                n1 = e;
                c1 = 1;
            }else if(c2 == 0){
                n2 = e;
                c2 = 1;
            }else{
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        
        for(int e : nums){
            if(e == n1)c1++;
            else if(e == n2)c2++;
        }
        
        
        if(c1 > nums.length / 3) ans.add(n1);
        if(c2 > nums.length / 3) ans.add(n2);
        
        return ans;
        
    }
}