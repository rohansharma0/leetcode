class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) return stones[0];
        
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int e : stones){
            maxPQ.add(e);
        }
        
        while(maxPQ.size() > 1){
            
            int x = maxPQ.poll();
            int y = maxPQ.poll();
            
            if(x != y) maxPQ.add(x-y);
            
        }
        if(maxPQ.size() == 1) return maxPQ.poll();
        return 0;
    }
}