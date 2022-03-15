class Solution {
    public String reverseWords(String s) {
       
        
        String[] str = s.trim().split("[ ]+");
        
        int i = 0;
        int j = str.length-1;
        
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