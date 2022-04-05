class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        int[] mp1 = new int[1001];
        int[] mp2 = new int[1001];
        
        for(int e : nums1){
            mp1[e]++;
        }
        
        for(int e : nums2){
            mp2[e]++;
        }
        
        List<Integer> res = new ArrayList<>();
        
        for(int i = 0; i<= 1000 ; i++){
            if(mp1[i] > 0 && mp2[i] > 0){
                for(int x = 0; x< Math.min(mp1[i] , mp2[i]) ; x++){
                    res.add(i);
                }
            }
        }
        
        int[] ans = new int[res.size()];
        
        for(int i = 0; i< ans.length;  i++){
            ans[i] = res.get(i);
        }
        
        return ans;
        
    }
}