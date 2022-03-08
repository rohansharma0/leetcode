class Solution {
    public List<List<Integer>> generate(int n) {

        List<List<Integer>> ans = new ArrayList<>();
        
        List<Integer> prev = null ;

        for(int i = 0 ; i< n ; i++){
            
            List<Integer> curr = new ArrayList<>();
            
            for(int j = 0 ; j<= i ; j++){
                
                if(j == 0 || j == i){
                    curr.add(1);
                }else{
                    curr.add(prev.get(j-1) + prev.get(j));
                }
                
            }
            
            ans.add(curr);
            prev = curr;
        }
        
        return ans;
    }
}