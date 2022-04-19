class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        HashMap<Character , Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < order.length() ; i++){
            map.put(order.charAt(i) , i+1);
        }
        
        
        for(int i = 0 ; i< words.length -1 ; i++){
            String fs = words[i];
            String ss = words[i+1];
            
            if(!solve(fs , ss , map)) return false; 
        }
        
        return true;
        
    }
    
    public boolean solve(String f , String s , HashMap<Character , Integer> map){
        
        int i = 0;
        int j = 0;
        
        while(i < f.length() && j < s.length()){
            if(f.charAt(i) != s.charAt(j)){
                if(map.get(f.charAt(i)) > map.get(s.charAt(j))){
                    return false;
                }
                return true;
            }
            i++;
            j++;
        }
        if(f.length() > s.length()) return false;
        return true;
    }
}