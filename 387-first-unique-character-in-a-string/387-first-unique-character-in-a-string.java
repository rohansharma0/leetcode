class Solution {
    public int firstUniqChar(String s) {
        
        if(s.length() == 1) return 0;
        
        Map<Character,Integer> mp = new HashMap<>();
        
        for(char ch : s.toCharArray()){
            
            if(mp.containsKey(ch)){
                mp.put(ch , mp.get(ch) + 1);
            }else{
                mp.put(ch , 1);
            }
            
        }
        for(int i = 0 ; i< s.length() ; i++){
            
            char ch = s.charAt(i);
            
            if(mp.get(ch) == 1){
                return i;
            }
            
        }
        
        return -1;
        
    }
}