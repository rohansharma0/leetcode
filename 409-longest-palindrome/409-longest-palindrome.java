class Solution {
    public int longestPalindrome(String s) {
        
        HashMap<Character , Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
           
            if(map.containsKey(c)){
                map.put(c , map.get(c)+1);
            }else{
                map.put(c , 1);
            }
            
        }
        
        int ans = 0;
        boolean odd = false;
        for(char c : map.keySet()){
            if(map.get(c) % 2 == 0){
                ans += map.get(c);
            }else{
                odd = true;
                ans += (map.get(c) -1);
            }
        }
        if(odd) ans++;
        return ans;
    }
}