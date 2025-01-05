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
    private int count = 0; // Counter to keep track of the current position
    private int result = 0; // To store the kth smallest value

    public int kthSmallest(TreeNode root, int k) {
        inOrderTraversal(root, k);
        return result;
    }

    private void inOrderTraversal(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        // Traverse the left subtree
        inOrderTraversal(root.left, k);

        // Process the current node
        count++;
        if (count == k) {
            result = root.val;
            return; // Stop traversal once we find the kth smallest
        }

        // Traverse the right subtree
        inOrderTraversal(root.right, k);
    }
}
