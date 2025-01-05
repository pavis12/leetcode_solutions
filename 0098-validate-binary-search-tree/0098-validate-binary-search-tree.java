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
    public boolean isValidBST(TreeNode r) {
        return f(r,Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean f(TreeNode r,long min,long max){
        if(r==null)return true;
        if(r.val<=min||r.val>=max)return false;
        return f(r.left,min,r.val)&&f(r.right,r.val,max);
    }
}