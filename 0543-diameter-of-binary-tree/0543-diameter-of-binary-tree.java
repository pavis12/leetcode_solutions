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
    public int diameterOfBinaryTree(TreeNode r) {
        if(r==null)return 0;
        int lh=h(r.left);
        int rh=h(r.right);
        int ld=diameterOfBinaryTree(r.left);
        int rd=diameterOfBinaryTree(r.right);
        return Math.max(rh+lh,Math.max(ld,rd));

    }
    public int h(TreeNode r){
        if(r==null)return 0;
        int lh=h(r.left);
        int rh=h(r.right);
        return 1+Math.max(lh,rh);
    }
}