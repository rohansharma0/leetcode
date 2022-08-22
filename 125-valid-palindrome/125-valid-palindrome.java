class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                char ch = Character.toLowerCase(c);
                str.append(ch);
            }
            
            if(Character.isDigit(c)){
                str.append(c);
            }
        }
        
        System.out.println(str);
        
        return solve(str.toString());
    }
    
    public boolean solve(String s){
        int i = 0;
        int j = s.length()-1;
        
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        
        return true;
    }
}