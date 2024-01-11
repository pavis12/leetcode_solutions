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
    public int s=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root!=null){
        rangeSumBST(root.left,low,high);
        if(root.val>=low&&root.val<=high){
            s+=root.val;
        }
        rangeSumBST(root.right,low,high);  
        }
        return s;
    }
}