class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        
        if(s1.equals(s2)) return true;
        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        
        for(char c : s1.toCharArray()){
            freq1[c-'a']++;
        }
        
        for(char c : s2.toCharArray()){
            freq2[c-'a']++;
        }
        
        for(int i =  0 ; i< 26 ; i++){
            if(freq1[i] != freq2[i]) return false;
        }
        int c = 0;
        for(int i = 0 ; i< s1.length() ; i++){
            if(s1.charAt(i) != s2.charAt(i)) c++;
        }
        
        if(c == 2) return true;
        return false;
    }
}