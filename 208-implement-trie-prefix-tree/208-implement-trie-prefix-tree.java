class Trie {
    
    private static Node root;
    
    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        
        Node node = root;
        
        for(char c : word.toCharArray()){
            
            if(!node.containsKey(c)){
                node.put(c , new Node());
            }
            
            //moves to the reference trie
            node = node.get(c);
        }
        
        node.setEnd();
    }
    
    public boolean search(String word) {
        
        Node node = root;
        
        for(char c : word.toCharArray()){
            
            if(!node.containsKey(c)){
                return false;
            }
            
            //moves to the reference trie
            node = node.get(c);
        }
        
        return node.isEnd(); 
        
    }
    
    public boolean startsWith(String prefix) {
        Node node = root;
        
        for(char c : prefix.toCharArray()){
            
            if(!node.containsKey(c)){
                return false;
            }
            
            //moves to the reference trie
            node = node.get(c);
        }
        
        return true;
    }
}

class Node{
    
    Node links[] = new Node[26];
    boolean flag = false;
    
    public Node(){    
    }
    
    public void setEnd(){
        this.flag = true;
    }
    
    public boolean isEnd(){
        return this.flag;
    }
    
    public Node get(char ch){
        return this.links[ch - 'a'];
    }
    
    public void put(char ch , Node node){
        this.links[ch-'a'] = node;
    }
    
    public boolean containsKey(char ch){
        return (this.links[ch - 'a'] != null);
    }
    
    
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */