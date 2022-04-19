class Solution {
    public List<Integer> getRow(int row) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        
        for(int i = 1 ; i<= row ; i++){
            List<Integer> res = new ArrayList<>();
            for(int j = 0 ; j<= i ; j++){
                if(j == 0 || j == i){
                    res.add(1);
                }else{
                    res.add(ans.get(j) + ans.get(j-1));
                }
            }
            
            ans = res;
        }
        
        return ans;
    }
}