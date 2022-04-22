class Solution {
    public String addStrings(String num1, String num2) {
        
        StringBuilder ans = new StringBuilder();
        int c = 0;
        int i = num1.length()-1;
        int j = num2.length()-1;
        while(i >= 0 || j >= 0 || c != 0){
            int res = c;
            if(i >= 0){
                res += (num1.charAt(i) - '0');
                i--;
            }
            if(j >= 0){
                res += (num2.charAt(j) - '0');
                j--;
            }
            
            int r = res % 10;
            c = res / 10;
            
            ans.append(Integer.toString(r));
        }
        
        return ans.reverse().toString();
    }
}