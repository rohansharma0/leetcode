class Solution {
    public List<List<Integer>> generate(int n) {
                
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> prev = null;

        for(int i = 0 ; i< n ; i++){
            List<Integer> temp = new ArrayList<>();
            
            for(int j = 0 ; j<= i ; j++){
                
                if(j == 0 || j == i) temp.add(1);
                else{
                    temp.add(prev.get(j-1) + prev.get(j));
                }
                
            }
            ans.add(temp);
            prev = temp;
        }
        
        return ans;
    }
}