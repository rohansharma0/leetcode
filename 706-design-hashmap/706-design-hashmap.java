class MyHashMap {
    
    int[] keys;
    int size;
    
    public MyHashMap() {
        this.size = (int)1e6+1;
        this.keys = new int[size];
        Arrays.fill(keys , -1);
    }
    
    public void put(int key, int value) {
        keys[key] =  value;
    }
    
    public int get(int key) {
        if(keys[key] == -1) return -1;
        return keys[key];
    }
    
    public void remove(int key) {
       if(keys[key] != -1) keys[key] = -1;
    }
}