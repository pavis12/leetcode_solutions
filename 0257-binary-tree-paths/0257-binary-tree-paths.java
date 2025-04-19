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
    public Set<String> l=new HashSet<>();
    public List<String> binaryTreePaths(TreeNode r) {
        f(r,"");
        List<String> p=new ArrayList<>();
        for(String i:l){
            p.add(i);
        }
        return p;
    }
    public void f(TreeNode r,String g){
        if(r==null){
            //l.add(g);
            return;
        }
        if(r.left!=null||r.right!=null){
            g+=r.val+"->";
            
        }
        else{
            g+=r.val;
            l.add(g);
        }
        f(r.left,g);
        f(r.right,g);
    }
}