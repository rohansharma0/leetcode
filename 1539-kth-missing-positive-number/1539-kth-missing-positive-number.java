class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int s = 0;
        int e = arr.length;
        
        while(s < e){
            int m = s + (e - s) /2;
            
            if(arr[m] - (m+1) >= k){
                e = m;
            }else{
                s = m+1;
            }
        }
        
        return s + k;
        
    }
}