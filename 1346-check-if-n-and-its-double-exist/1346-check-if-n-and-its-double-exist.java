class Solution {
    public boolean checkIfExist(int[] arr) {
        
        HashSet<Integer>set=new HashSet<>();
        
        for(int e : arr){
            if((set.contains(e*2)) ||
               (e % 2 == 0 && set.contains(e/2))) return true;
            set.add(e);
        }
        
        return false;
    }
}