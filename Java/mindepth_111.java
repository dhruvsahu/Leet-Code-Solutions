class Solution {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        int leftdep=(root.left!=null)?minDepth(root.left):Integer.MAX_VALUE;
        int rightdep=(root.right!=null)?minDepth(root.right):Integer.MAX_VALUE;
        
        return Math.min(leftdep,rightdep)+1;
    }
}