/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            // If both nodes are in the left subtree
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            }
            // If both nodes are in the right subtree
            else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            }
            // If the nodes are on different sides or one of them is the root, return the root
            else {
                return root;
            }
        }
        return null; // This case won't be hit if p and q are guaranteed to be in the tree
    }
}
