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
    public int a[]=new int[100005];
    public int k=0;
    public int getMinimumDifference(TreeNode root) {
        inord(root);
        //k--;
        int b[]=new int[k];
        for(int i=0;i<k;i++){
            b[i]=a[i];
        }
        Arrays.sort(b);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<k;i++){
            int d=Math.abs(a[i-1]-a[i]);
            if(min>d){
                min=d;
            }

        }
        return min;

    }
    public void inord(TreeNode root){
        if(root==null){
            return;
        }
        inord(root.left);
        a[k++]=root.val;
        inord(root.right);

    }
}