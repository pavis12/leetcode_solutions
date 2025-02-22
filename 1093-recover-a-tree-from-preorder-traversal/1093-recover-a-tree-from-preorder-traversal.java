import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}

class Solution {
    public TreeNode recoverFromPreorder(String t) {
        Stack<TreeNode> stack = new Stack<>();
        int i = 0, n = t.length();

        while (i < n) {
            int depth = 0;
            
            // Count dashes to determine depth
            while (i < n && t.charAt(i) == '-') {
                depth++;
                i++;
            }
            
            int num = 0;
            // Read the number (node value)
            while (i < n && Character.isDigit(t.charAt(i))) {
                num = num * 10 + (t.charAt(i) - '0');
                i++;
            }

            // Create the new node
            TreeNode node = new TreeNode(num);

            // Attach node to its correct parent
            if (depth == stack.size()) {
                // If depth matches stack size, it's a left child
                if (!stack.isEmpty()) {
                    stack.peek().left = node;
                }
            } else {
                // Pop until we find the correct parent at depth - 1
                while (stack.size() > depth) {
                    stack.pop();
                }
                // Now, attach as right child
                stack.peek().right = node;
            }

            // Push the current node onto the stack
            stack.push(node);
        }

        // Return the root (bottom-most node in stack is the first added)
        while (stack.size() > 1) {
            stack.pop();
        }
        return stack.peek();
    }
}
