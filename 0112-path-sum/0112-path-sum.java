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
    boolean t = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false; // If the tree is empty, return false
        }
        in(root, targetSum, 0);
        return t;
    }

    public void in(TreeNode root, int ts, int p) {
        if (root == null) {
            return;
        }
        p += root.val; // Update the current path sum
        if (root.left == null && root.right == null && p == ts) {
            t = true; // If we reach a leaf node with the target sum, update t to true
            return; // Return from this branch
        }
        // Traverse left and right subtrees
        in(root.left, ts, p);
        in(root.right, ts, p);
    }
}
