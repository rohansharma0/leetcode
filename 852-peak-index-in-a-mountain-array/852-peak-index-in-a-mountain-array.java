class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int maxI = 0;
        int max = 0;
        
        for(int i = 1 ; i< arr.length - 1; i++){
            
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                
                if(arr[i] > max){
                    max = arr[i];
                    maxI = i;
                }
                
            }
        }
        
        return maxI;
    }
}