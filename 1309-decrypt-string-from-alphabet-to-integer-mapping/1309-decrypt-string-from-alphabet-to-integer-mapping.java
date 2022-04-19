class Solution {
    public String freqAlphabets(String s) {
        
        StringBuilder ans = new StringBuilder();
        
        int i = s.length()-1;
        
        while(i >= 0){
            char c = s.charAt(i);
            if(c == '#'){
                int x = (s.charAt(i-2) - '0') * 10 + (s.charAt(i-1) - '0');
                
                ans.append((char)((x - 1) + 'a'));
                i = i - 2;
            }else{
                char x = (char)(((c - '0') - 1) + 'a');
                ans.append(x);    
            }
            i--;
        }
        
        return ans.reverse().toString();
    }
}