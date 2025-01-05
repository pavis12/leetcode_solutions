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
    public TreeNode deleteNode(TreeNode r, int k) {
        if(r==null)return r;
        if(r.val==k){
            if(r.left==null&&r.right==null){
                r=null;
            }
            else if(r.right!=null&&r.left==null){
                r=r.right;
            }
            else if(r.left!=null&&r.right==null){
                r=r.left;
            }
            else{
                TreeNode t=r.right;
                r=r.left;
                TreeNode f=r;
                while(f.right!=null){
                    f=f.right;
                }
                f.right = t;
            }
            return r;
        }
        else if(r.val<k){
            r.right = deleteNode(r.right,k);
        }
        else{
            r.left = deleteNode(r.left,k);
        }
        return r;
    }
}