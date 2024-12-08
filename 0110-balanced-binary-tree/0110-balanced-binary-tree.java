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
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        return p(root)!=-1;
    }
    public int p(TreeNode root){
        if(root==null)return 0;
        int lh=p(root.left);
        int rh=p(root.right);
        int s=Math.abs(lh-rh);
        if(s>1||lh==-1||rh==-1)return -1;
        return 1+Math.max(lh,rh); 

    }
}