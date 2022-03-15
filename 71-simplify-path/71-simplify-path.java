class Solution {
    public String simplifyPath(String path) {
        
        Stack<String> st = new Stack<>();
        
        String[] s = path.split("/");
        
        StringBuilder ans = new StringBuilder();
        
        for(String x : s){
            if(x.equals("..")){
                if(st.size() > 0){
                    st.pop();
                }
            }else if(!x.equals("") && !x.equals(".") && !x.equals("..")) {
                st.push(x);
            }
        }
        
        if(st.size() == 0) return"/";
        
        while(st.size()>0){
            ans.insert(0 , st.pop()).insert(0 , "/");
        }
        
        return ans.toString();
    }
}