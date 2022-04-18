class MyHashSet {

    int[] keys;
    int size;
    
    public MyHashSet() {
        this.size = (int)1e6+1;
        this.keys = new int[size];
        Arrays.fill(keys , -1);
    }
    
    public void add(int key) {
        keys[key] = key;
    }
    
    public void remove(int key) {
        keys[key] = -1;
    }
    
    public boolean contains(int key) {
        return (keys[key] != -1);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */