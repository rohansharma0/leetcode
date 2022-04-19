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
    TreeNode sN = null , mN = null , lN = null;
    TreeNode prev = null;
    
    public void recoverTree(TreeNode root) {

        inorder(root);
        
        if(lN != null){
            int t = sN.val;
            sN.val = lN.val;
            lN.val = t;
        }else{
            int t = sN.val;
            sN.val = mN.val;
            mN.val = t;
        }
        
    }
    
    public void inorder(TreeNode root){
         
        if(root == null) return;
        
        inorder(root.left);
        
        if(prev == null || root.val < prev.val){
            if(sN == null){
                sN = prev;
                mN = root;
            }else{
                lN = root;
            }
        }
        prev = root;
        inorder(root.right);
    }
}