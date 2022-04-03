class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        
        for(int e : nums){
            if(st.contains(e)) return true;
            st.add(e);
        }
        
        return false;
    }
}