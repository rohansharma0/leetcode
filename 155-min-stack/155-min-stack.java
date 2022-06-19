class MinStack {
    
    Stack<Node> st;
    
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.size()==0){
            st.push(new Node(val , val));
        }else{
            if(val < st.peek().min){
                st.push(new Node(val , val));
            }else{
                st.push(new Node(val , st.peek().min));
            }
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().val;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}

class Node{
    int val;
    int min;
    
    Node(int v , int m){
        this.val = v;
        this.min = m;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */