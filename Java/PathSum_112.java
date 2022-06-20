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
       public boolean hasPathSum(TreeNode root, int targetSum) {
           if(root==null){
               return false;
           }
           targetSum-=root.val;
           if(root.left==null && root.right==null) {
               if(0==targetSum){
                   return true;
               }
           }
           boolean A=false,B=false;
           if(root.left!=null) A=hasPathSum(root.left,targetSum);
           if(root.right!=null) B=hasPathSum(root.right,targetSum);
           return A||B;
       }
   }