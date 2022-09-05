class Solution {
    public int findMaximumXOR(int[] nums) {
        
        Trie trie = new Trie();
        
        int maxXor = 0;
    
        for(int i = 0 ; i< nums.length ; i++){
            trie.add(nums[i]);
        }
        
        for(int i = 0; i< nums.length ; i++){
            
            int res = trie.getMax(nums[i]);
            maxXor = Math.max(res , maxXor);
        }
        
        return maxXor;
        
    }
}

class Trie{
    
    public Node root;
    
    Trie(){
        root = new Node();
    }
    
    
    public void add(int n){
        
        Node node = root;
        
        for(int i = 31 ; i>= 0 ; i--){
            
            int bit = (n >> i) & 1;
            
            if(!node.containsKey(bit)){
                node.put(bit , new Node());
            }
            node = node.get(bit);
            
        }
    }
    
    public int getMax(int n){
        
        Node node = root;
        int maxNum = 0;
        
        for(int i = 31 ; i>= 0 ; i--){
            
            int bit = (n >> i) & 1;
            
            if(node.containsKey(1 - bit)){
                maxNum =  maxNum | (1 << i);
                node = node.get(1 - bit);
            }else{
                node = node.get(bit);
            }
            
        }
        
        return maxNum;
    }
  
    
}

class Node{
    
    Node[] links = new Node[2];
     
    
    public boolean containsKey(int i){
        return this.links[i] != null;
    }
    
    public void put(int i , Node node){
        this.links[i] = node;
        
    }
    
    public Node get(int i){
        return this.links[i];
    }
}