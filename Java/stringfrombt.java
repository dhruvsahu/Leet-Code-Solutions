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
    String s="";
    public String tree2str(TreeNode root) {
        if(root==null){
            return null;
        }
        s=s+Integer.toString(root.val);
        if(root.left!=null){
            s=s+"(";
            tree2str(root.left);
            s=s+")";
        }else if(root.right!=null){
            s=s+"()";
        }
        if(root.right!=null){
            s=s+"(";
            tree2str(root.right);
            s=s+")";
        }
        return s;
    }
}