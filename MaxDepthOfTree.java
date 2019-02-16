/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        
        if(root == null)
            return 0;
        
        int ldepth = 0;
        int rdepth = 0;
        
        if(root.left != null)
            ldepth = maxDepth(root.left);
        if(root.right != null)
            rdepth = maxDepth(root.right);
        
        return Math.max(ldepth, rdepth) + 1;
        
    }
}
