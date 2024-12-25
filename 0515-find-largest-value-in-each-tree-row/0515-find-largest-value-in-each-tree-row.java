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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        if(root==null){
            return l;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int m=Integer.MIN_VALUE;
            int t=q.size();
            for(int i=0;i<t;i++){
                TreeNode c=q.poll();
                m=Math.max(c.val,m);
                if(c.left!=null)q.add(c.left);
                if(c.right!=null)q.add(c.right);
            }
            l.add(m);
        }
        return l;
        
    }
}