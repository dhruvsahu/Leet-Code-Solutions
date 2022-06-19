class Solution {
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        leaves(root,false);
        return sum;
    }
    public void leaves(TreeNode root,boolean leaf){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null && leaf){
            sum+=root.val;
        }
        leaves(root.left,true);
        leaves(root.right,false);
    }
}