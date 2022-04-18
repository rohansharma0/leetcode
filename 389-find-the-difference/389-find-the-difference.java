class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq = new int[26];
        
        for(char c : t.toCharArray()){
            freq[c - 'a']++;
        }
        for(char c : s.toCharArray()){
            freq[c - 'a']--;
        }
        char ans = 'a';
        for(int i = 0 ; i< 26 ; i++){
            if(freq[i] == 1){
                ans = (char)('a' + i);
                break;
            }
        }
        return ans;
        
    }
}