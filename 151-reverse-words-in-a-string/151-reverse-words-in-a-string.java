class Solution {
    public String reverseWords(String s) {
        
        int i = 0;
        int j = s.length()-1;
        
        while(s.charAt(i) == ' '){
            i++;
        }
        while(s.charAt(j) == ' '){
            j--;
        }
        
        String[] str = s.substring(i , j+1).split("[ ]+");
        
        i = 0;
        j = str.length-1;
        
        while(i < j){
            String t = str[i];
            str[i] = str[j];
            str[j] = t;
            i++;
            j--;
        }
        
        String ans =  String.join(" ", str);
        
        return ans;
    }
}