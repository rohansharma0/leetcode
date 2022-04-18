class MyHashSet {

    List<Integer>[] nums;
    int n;
    
    public MyHashSet() {
        this.n = 15000;
        this.nums = new LinkedList[n];
    }
    
    private int hash(int key){
        return key % n;
    }
    
    public void add(int key) {
        int i = hash(key);
        if(nums[i] == null) nums[i] = new LinkedList<>();
        if(nums[i].indexOf(key) == -1){
            nums[i].add(key);
        }
    }
    
    public void remove(int key) {
        int i = hash(key);
        if(nums[i] == null) return;
        if(nums[i].indexOf(key) != -1){
            nums[i].remove(nums[i].indexOf(key));
        }
    }
    
    public boolean contains(int key) {
        int i = hash(key);
        if(nums[i] == null || nums[i].indexOf(key) == -1) return false;
        return true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */