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
class BSTIterator {
    public Stack<TreeNode> st=new Stack<>();
    public BSTIterator(TreeNode r) {
        p(r);
    }
    
    public int next() {
        TreeNode c=st.pop();
        p(c.right);
        return c.val;
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }
    public void p(TreeNode r){
        while(r!=null){
            st.push(r);
            r=r.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */