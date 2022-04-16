class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int sum = 0;
        
        for(int i = 0; i< arr.length ; i++){
            int s = 0;
            for(int j = i ; j < arr.length ; j++){
                s+= arr[j];
                if((j - i) % 2 == 0){
                    sum += s;
                }
                
            }
        }
        
        return sum;
    }
}