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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> l=new ArrayList<>();
        if(root==null)return l;
        q.add(root);
        int f=0;
        while(!q.isEmpty()){
            List<Integer> r=new ArrayList<>();
            int t=q.size();
            for(int i=0;i<t;i++){
                TreeNode c=q.remove();
                r.add(c.val);
                if(c.left!=null)q.add(c.left);
                if(c.right!=null)q.add(c.right);
            }
            if(f==0){
                l.add(r);
                f=1;
            }
            else{
                Collections.reverse(r);
                l.add(r);
                f=0;
            }
        }
        return l;
    }
}