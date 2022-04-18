class Solution {
    public String interpret(String command) {
        
        StringBuilder ans = new StringBuilder();
        
        int i = 0;
        
        while(i < command.length()){
            char c = command.charAt(i);
            
            if(c == 'G'){
                ans.append("G");
            }else{
                if(command.charAt(i+1) == ')'){
                    ans.append("o");
                    i++;
                }else{
                    ans.append("al");
                    i= i+ 3;
                }
            }
            
            i++;
        }
        
        return ans.toString();
        
    }
}