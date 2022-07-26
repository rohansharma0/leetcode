class Solution {
    public int countArrangement(int n) {
        
        int[] ans = new int[1];
        ans[0] = 0;
        
        solve(1 , new ArrayList<>() , n , ans);
        
        return ans[0];
    }
    
    public void solve(int idx , List<Integer> ds , int n , int[] ans){
        
        if(ds.size() == n){
            ans[0] += 1;
            // System.out.println(ds);
            return;
        }
        
        
        for(int i = 1 ; i<= n ; i++){
            
            if(ds.contains(i)) continue;
            
            if(i % idx != 0 && idx % i != 0) continue;
            
            ds.add(i);
            
            solve(idx+1 , ds , n , ans);
            
            ds.remove(ds.size()-1);
            
        }
        
    }
}