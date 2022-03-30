class Solution {
    public int countCollisions(String s) {
        
        int n = s.length();
        
        int i = 0;
        int j = n-1;
        
        while(i < n && s.charAt(i) == 'L') i++;
        while(j >= 0 && s.charAt(j) == 'R') j--;
        
        int ans = 0;
        
        for(int x = i ; x<= j ; x++){
            if(s.charAt(x) != 'S') ans++;
        }
        return ans;
    }
}