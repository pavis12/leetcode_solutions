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
class Result{
    TreeNode n;
    int d;
    Result(TreeNode n,int d){
        this.n=n;
        this.d=d;
    }
}
class Solution {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return f(root).n;
    }
    public Result f(TreeNode r){
        if(r==null){
            return new Result(null,0);
        }
        Result l=f(r.left);
        Result ri=f(r.right);
        if(l.d==ri.d){
            return new Result(r,l.d+1);
        }
        else if(l.d>ri.d){
            return new Result(l.n,l.d+1);
        }
        
            return new Result(ri.n,ri.d+1);
        
    }
}