class Solution {
    public String getPermutation(int n, int k) {
        
        List<Integer> arr = new ArrayList<>();
        
        int fact = 1;
        for(int i = 1 ; i<= n ; i++){
            arr.add(i);
            fact = fact * i;
        }
        
        fact = fact / n; // 6;
        k--; // 16
        
        
        StringBuilder ans = new StringBuilder();
        
        while(true){
            
            ans.append(arr.get(k / fact));
            arr.remove(k / fact);
            
            if(arr.size() == 0){
                break;
            }
            
            k = k % fact;
            
            fact = fact / arr.size();
        }
        
        return ans.toString();
    }
}