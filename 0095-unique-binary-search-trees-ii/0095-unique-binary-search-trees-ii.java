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
    public List<TreeNode> generateTrees(int n) {
        if(n==0){
            return new ArrayList<>();
        }
        List<TreeNode> t=helper(1,n);
        return t;
    }
    public List<TreeNode> helper(int lo,int hi){
        List<TreeNode> res=new ArrayList<>();
        if(lo>hi){
            res.add(null);
            return res;
        }
        for(int i=lo;i<=hi;i++){
            //keeping i as root
            List<TreeNode> l=helper(lo,i-1);
            List<TreeNode> r=helper(i+1,hi);
            for(TreeNode k:l){
                for(TreeNode j:r){
                    TreeNode n=new TreeNode(i);
                    n.left=k;
                    n.right=j;
                    res.add(n);
                }
            }
            
        }
        return res;
    }
}