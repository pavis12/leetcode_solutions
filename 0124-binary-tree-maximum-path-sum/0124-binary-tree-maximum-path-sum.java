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
    int p=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        m(root);
        return p;
        
    }
    public int m(TreeNode root){
        if(root==null)return 0;
        int l=Math.max(m(root.left),0);
        int r=Math.max(m(root.right),0);
        p=Math.max(l+r+root.val,p);
        return root.val+ Math.max(l,r);
    }
}