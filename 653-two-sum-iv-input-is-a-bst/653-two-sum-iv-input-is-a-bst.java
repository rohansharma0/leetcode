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
    public boolean findTarget(TreeNode root, int k) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root , arr);
        
        int i = 0;
        int j = arr.size()-1;
        
        while(i < j){
            if(arr.get(i) + arr.get(j) > k){
                j--;
            }else if(arr.get(i) + arr.get(j) < k){
                i++;
            }else{
                return true;
            }
        }
        
        return false;
        
    }
    public void inorder(TreeNode root , ArrayList<Integer> st){
        if(root == null) return;
        
        inorder(root.left , st);
        st.add(root.val);
        inorder(root.right , st);
        
    }
}