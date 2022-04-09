class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> que = new PriorityQueue<>((a , b) -> b.et - a.et);
        
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int e : nums){
            if(map.containsKey(e)){
                map.put(e , map.get(e)+1);
            }else{
                map.put(e , 1);
            }
        }
        
        for(int e : map.keySet()){
            que.add(new Pair(e , map.get(e)));
        }
        
        int[] ans = new int[k];
        
        int idx = 0;
        
        while(idx < k){
            Pair p = que.poll();
            ans[idx++] = p.st;
        }
        
        return ans;
    }
}

class Pair{
    int st;
    int et;
    
    Pair(int st , int et){
        this.st = st;
        this.et = et;
    }
}