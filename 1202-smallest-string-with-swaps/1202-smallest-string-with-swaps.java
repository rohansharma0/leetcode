class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        
        int n = s.length();
        
        Map<Integer , PriorityQueue<Character>> map = new HashMap<>();
        
        UnionFind uf = new UnionFind(n);
        
        for(List<Integer> p : pairs){
            uf.union(p.get(0) , p.get(1));
        }
        
        for(int i = 0; i< n ; i++){
            int id = uf.find(i);
            PriorityQueue<Character> pq = map.getOrDefault(id , new PriorityQueue<Character>());
            pq.offer(s.charAt(i));
            map.putIfAbsent(id , pq);
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i< n ; i++){
            int id = uf.find(i);
            ans.append(map.get(id).poll());
        }
        return ans.toString();
        
    }
}

class UnionFind{
    
    private int[] parent;
    private int[] rank;
    
    UnionFind(int n){
        parent = new int[n];
        rank = new int[n];
        
        for(int i = 0; i< n ; i++){
            parent[i] = i;
            rank[i] = 0;
        }
    }
    
    public int find(int node){
        if(node == parent[node]) return node;
        return parent[node] = find(parent[node]);
    }
    
    public void union(int u , int v){
        u = find(u);
        v = find(v);
        
        if(rank[u] < rank[v]){
            parent[u] = v;
        }else if(rank[u] > rank[v]){
            parent[v] = u;
        }else{
            parent[v] = u;
            rank[u]++;
        }
    }
    
}