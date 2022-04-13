/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
     List<List<Integer>> ans = new ArrayList<>();
        
        if(root == null) return ans;
        
        ArrayDeque<TreeNode> que = new ArrayDeque<>();
        
        que.add(root);
        
        while(que.size()> 0){
            int n = que.size();
            
            List<Integer> temp = new ArrayList<>();
            
            while(n-- > 0){
                TreeNode x = que.poll();
                temp.add(x.val);
                
                if(x.left != null){
                    que.add(x.left);
                }
                if(x.right != null){
                    que.add(x.right);
                }
                
            }
            
            ans.add(new ArrayList<>(temp));
        }
        
        return ans;
    }
}