class Solution {
    public int minCostConnectPoints(int[][] points) {
        int cost = 0;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a , b) -> (a[2] - b[2]));
        Set<Integer> vis = new HashSet<>();
        pq.offer(new int[]{0 , 0 , 0});
        
        int n = points.length;
        
        while(pq.size() > 0 && vis.size() < n){
            int[] cur = pq.poll();
            int endId = cur[1];
        
            if(vis.contains(endId)) continue;
            
            cost += cur[2];
            vis.add(cur[1]);
            for(int i = 0 ; i< n ; i++){
                if(!vis.contains(i)){
                    pq.offer(new int[] {endId , i , dis(points , endId , i)});
                }
            }
        }
        
        
        return cost;
    }
    public int dis(int[][] points , int i , int j){
        return Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
    }
}