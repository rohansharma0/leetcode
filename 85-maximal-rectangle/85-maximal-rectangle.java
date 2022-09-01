class Solution {
    public int maximalRectangle(char[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int[] arr = new int[m];
        
        int max = 0;
        
        for(char[] x : matrix){
            
            for(int i = 0 ; i< m ; i++){
                
                if(x[i] == '0'){
                    arr[i] = 0;
                }else{
                    arr[i]++;
                }
                
            }
            
            max = Math.max(max , solve(arr));
            
        }
        
        return max;
        
    }
    
    
    public int solve(int[] h){
    
        int n = h.length;
        
        Stack<Integer> st = new Stack<>();
        int maxA = 0;
        for(int i = 0; i<= n ; i++){
            
            while(st.size() > 0 && (i == n || h[st.peek()] >= h[i])){
                
                int height = h[st.pop()];
                
                int width = 0;
                if(st.size() == 0) width = i;
                else width = i - st.peek() - 1;
                maxA = Math.max(maxA , width * height);
            }
            st.push(i);
        }
        
        return maxA;
    }
}