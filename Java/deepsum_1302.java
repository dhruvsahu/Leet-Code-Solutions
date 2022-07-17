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
    int sum=0;
    int max=0;
    public int deepestLeavesSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        max=maxDepth(root);
        return sumleaf(root,1);
    }
    public int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
    public int sumleaf(TreeNode root,int level){
        if(root == null){
            return 0;
        }
        if(root.left!=null)
            sumleaf(root.left,level+1);
        if(root.right!=null)
            sumleaf(root.right,level+1);
        if(root.left==null && root.right==null && level==max)
            sum+=root.val;
        return sum;
    }
}