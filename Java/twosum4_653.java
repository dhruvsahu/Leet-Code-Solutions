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
    HashSet<Integer> map = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root==null){
            return false;
        }
        boolean r=false;
        boolean l=false;
        if(map.contains(k-root.val)){
            return true;
        }
        map.add(root.val);
        if(root.left!=null){
            r=findTarget(root.left,k);
        }
        if(root.right!=null){
            l=findTarget(root.right,k);
        }
        return r||l;
    }
}