class Solution {
    public int equalPairs(int[][] grid) {
        
        HashMap<String , Integer> map = new HashMap<>();
        
        for(int i = 0 ; i< grid.length ; i++ ){
            
            String s = "";
            
            for(int e : grid[i]){
                s += e + "-";
            }
            if(map.containsKey(s)){
                map.put(s , map.get(s) + 1);
            }else{
                map.put(s , 1);
            }
        }
        
        
        // System.out.println(map);
        
        
        int ans = 0;
        
        for(int i = 0 ; i< grid.length ; i++ ){
            
            String s = "";
            
            for(int j = 0 ; j< grid[0].length ; j++ ){
                
                s +=grid[j][i] + "-";
            
            }
            
            if(map.containsKey(s)){
                ans+= map.get(s);
            }
        }
        
        return ans;
        
    }
}