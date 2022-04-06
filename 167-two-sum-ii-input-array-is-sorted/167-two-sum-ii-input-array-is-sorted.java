class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        
        int n =  numbers.length;
        
        int i = 0;
        int j = 0;
        
        for(int x = 0; x< n ; x++){
            
            int tar = target - numbers[x];
            
            int s = x+1;
            int e = n-1;
            
            while(s <= e){
                
                int m = s + (e - s) /2;
                
                if(numbers[m] == tar){
                    i = x;
                    j = m;
                    break;
                }else if(numbers[m] > tar){
                    e = m-1;
                }else{
                    s = m+1;
                }
            }
            
        }
        ans[0] = i+1;
        ans[1] = j+1;
        return ans;
    }
}