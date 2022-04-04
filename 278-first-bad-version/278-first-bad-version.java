/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int l = 1;
        int r = n;
        
        int ans = n;
        
        while(l <= r){
            int m = l + (r - l)/2;
            
            if(!isBadVersion(m)){
                l = m + 1;
            }else{
                ans = Math.min(m , ans);
                r = m-1;
            }
        }
        
        return ans;
        
    }
}