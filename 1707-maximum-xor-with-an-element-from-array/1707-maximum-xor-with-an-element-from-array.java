class Solution {
    public int[] maximizeXor(int[] nums, int[][] queries) {
        
        TrieNode root = new TrieNode();
        int q = queries.length;
        
        int[][] arr = new int[q][3];
        
        for(int i = 0 ; i< q ; i++){
            arr[i][0] = queries[i][0];
            arr[i][1] = queries[i][1];
            arr[i][2] = i;
        }
        Arrays.sort(nums);
        Arrays.sort(arr , (a , b) -> a[1] - b[1]);
        
        int idx = 0;
        
        int[] ans = new int[q];
        
        
        for(int i = 0 ; i< q ; i++){
            int max = -1;
            
            while(idx < nums.length  && nums[idx] <= arr[i][1]){
                add(root , nums[idx]);
                idx++;
            }
            
            if(nums[0] > arr[i][1]){
                ans[arr[i][2]] = -1;
            }else{
                ans[arr[i][2]] = maxXor(root , arr[i][0]);
            }
            
        }
        
        return ans;
    }
    
    private int maxXor(TrieNode root, int x){
        TrieNode cur = root;
        int rst = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (x >>> i) & 1;            
            if (cur.next[1-bit] != null) { 
                rst += (1 << i);
                cur = cur.next[1-bit];
            }else{
                cur = cur.next[bit];
            }
        }
        return rst;
    }
    private void add(TrieNode root, int n){
        TrieNode cur = root;
        for (int i = 31; i >= 0; i--){
            int bit = (n >>> i) & 1;
            if (cur.next[bit] == null){
                cur.next[bit] = new TrieNode();
            }
            cur = cur.next[bit];
        }
    }


    class TrieNode{
        TrieNode[] next;
        TrieNode(){
            next = new TrieNode[2];
        }
    }
}
