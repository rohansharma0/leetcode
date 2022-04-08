class KthLargest {

    PriorityQueue<Integer> minH;
    int size;
    
    public KthLargest(int k, int[] nums) {
        minH = new PriorityQueue<>();
        size = k;
        int c = 0;
        for(int e : nums){
            c++;
            if(c <= k){
                minH.add(e);
            }else{
                if(minH.peek() < e){
                    minH.poll();
                    minH.add(e);
                }
            }
        }
        
    }
    
    public int add(int val) {
        if(minH.size() < size){
            minH.add(val);
        }else if(minH.size() > 0 && minH.peek() < val){
            minH.poll();
            minH.add(val);
        }
        
        return minH.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */