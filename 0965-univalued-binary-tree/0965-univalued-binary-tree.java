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
    public boolean t=true;
    
    public boolean isUnivalTree(TreeNode root) {
        
       inorder(root,root.val);
        return t;
    }
    public void inorder(TreeNode root,int val){
        if(root==null){
            return;
        }
        inorder(root.left,val);
        int h=root.val;
        if(h!=val){
            t=false;
            return;
        }
        inorder(root.right,val);
        
    }
}