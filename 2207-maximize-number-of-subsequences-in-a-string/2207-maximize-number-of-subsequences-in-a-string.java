class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        
        String s1 = pattern.charAt(0) + text;
        String s2 = text + pattern.charAt(1);
        
        long cnt1 = 0 ,  ans1 = 0;
        
        for(int i = 0; i< s1.length() ; i++){
            if(s1.charAt(i) == pattern.charAt(0)) cnt1++;
            else if(s1.charAt(i) == pattern.charAt(1)) ans1 += cnt1;
        }
        
        if(pattern.charAt(0) == pattern.charAt(1)) {
            ans1 = (cnt1 * (cnt1 -1) / 2);
        }
        
        long cnt2 = 0 ,  ans2 = 0;
        
        for(int i = s2.length()-1; i>= 0; i--){
            if(s2.charAt(i) == pattern.charAt(1)) cnt2++;
            else if(s2.charAt(i) == pattern.charAt(0)) ans2 += cnt2;
        }
        
        if(pattern.charAt(0) == pattern.charAt(1)) {
            ans2 = (cnt2 * (cnt2 -1) / 2);
        }
        
        return Math.max(ans1 , ans2);
    }
    
    
    
}