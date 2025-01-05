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
    public TreeNode bstFromPreorder(int[] p) {
       return f(p,0,p.length-1);
    }
    public TreeNode f(int[] p,int s,int e){
        if(s>e)return null;
        TreeNode r=new TreeNode(p[s]);
        int i=1;
        for(i=s+1;i<=e;i++){
            if(p[i]>r.val)break;
        }
        r.left=f(p,s+1,i-1);
        r.right = f(p,i,e);
        return r;
    }
}