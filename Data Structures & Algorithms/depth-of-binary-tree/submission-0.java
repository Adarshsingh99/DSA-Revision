
class Solution {

    public int maxDepth(TreeNode root) {
        return solve(root);
    }
    public int solve(TreeNode root)
    {
        if(root == null) return 0;

         int left =0;
        int right = 0;

         left = 1 +  solve(root.left);
         right =  1 + solve(root.right);
        return Math.max(left,right);
    }
}
