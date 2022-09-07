class Solution {
    public int myAtoi(String s) {
        
        int n = s.length();
        
        if(n == 0) return 0;
        
        int i = 0;
        
        //remove whitespaces
        while(i < n && s.charAt(i) == ' ') i++;
        
        int isNeg = 0;
        if(i < n){
            if(s.charAt(i) == '-'){
                isNeg = 1;
                i++;
            }else if(s.charAt(i) == '+') i++;
        }
        
        
        int res = 0;
        
        while(i < n && Character.isDigit(s.charAt(i))){
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7)) {
				if (isNeg == 1) {
					return Integer.MIN_VALUE;
				}
				return Integer.MAX_VALUE;
			}
            res = (res * 10 ) + (s.charAt(i) - '0') ;
            i++;
        }
        return (isNeg == 0 ? res : -res);
    }
}