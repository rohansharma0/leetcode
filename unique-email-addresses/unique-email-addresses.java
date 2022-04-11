class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> st = new HashSet<>();
        
        for(String s : emails){
            
            String[] x = s.split("[@]");
            
            StringBuilder email = new StringBuilder();
            
            for(char c : x[0].toCharArray()){
                if(c == '.'){
                    continue;
                }
                else if(c == '+'){
                    break;
                }else{
                    email.append(c);
                }
            }
            
            email.append("@" + x[1]);
            
            // System.out.println(email);
            st.add(email.toString());
            
        }
        
        return st.size();
    }
}