class RandomizedSet {
    
    Map<Integer , Integer> map;
    List<Integer> nums;
    Random rndm;
    
    public RandomizedSet() {
        map = new HashMap<>();
        nums = new ArrayList<>();
        rndm = new Random();
    }
    
    public boolean insert(int val) {
        
        if(map.containsKey(val)) return false;
        
        map.put(val , nums.size());
        nums.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        
        if(!map.containsKey(val)) return false;
        
        int idx = map.get(val);
        int lastIdx = nums.size()-1;
        
        if(idx != lastIdx){
            int lastVal = nums.get(lastIdx);
            nums.set(idx , lastVal);
            map.put(lastVal , idx);
        }
        
        nums.remove(lastIdx);
        map.remove(val);

        return true;
    }
    
    public int getRandom() {
        int rnIdx = rndm.nextInt(nums.size());
        
        return nums.get(rnIdx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */