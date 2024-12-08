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
    public List<List<Integer>> levelOrder(TreeNode r) {
        List<List<Integer>> l=new ArrayList<>();
        if(r==null)return l;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(r);
        while(!q.isEmpty()){
            //TreeNode c=q.remove();
            int t=q.size();
            List<Integer> p=new ArrayList<>();
            for(int i=0;i<t;i++){
                TreeNode c=q.remove();
                p.add(c.val);
                if(c.left!=null)q.add(c.left);
                if(c.right!=null)q.add(c.right);
            }
            l.add(p);

        }
        return l;
    }
}