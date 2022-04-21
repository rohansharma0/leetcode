class Solution {
    public int[] sortByBits(int[] arr) {
        
        Pair[] pair = new Pair[arr.length];
        
        for(int i = 0 ; i< arr.length ; i++){
            pair[i] = new Pair(arr[i] , countBit(arr[i]));
        } 
        
        Arrays.sort(pair , (a , b) -> (a.nob == b.nob ) ? (a.no - b.no) : (a.nob - b.nob));
        
        int[] ans = new int[arr.length];
        
        for(int i = 0; i< arr.length; i++){
            ans[i] = pair[i].no;
        }
        
        return ans;
        
    }
    
    public int countBit(int n){
        
        int c = 0;
        
        while(n > 0){
            n = n - (n & -n);
            c++;
        }
        
        return c;
        
    }
}

class Pair{
    int no;
    int nob;
    
    Pair(int no , int nob){
        this.no = no;
        this.nob = nob;
    }
}