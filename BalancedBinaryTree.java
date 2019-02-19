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
    public boolean isBalanced(TreeNode root) {
     
        if(root == null)
            return true;
        
        if((depth(root.left) - depth(root.right)) > 1 ||
          (depth(root.left) - depth(root.right)) < -1)
            return false;
        
        else
            return isBalanced(root.left) && isBalanced(root.right);
       
    }
    
    public int depth(TreeNode root) {
        if(root == null)
            return 0;
        
        int ldepth = 0;
        int rdepth = 0;
        
        if(root.left != null)
            ldepth = depth(root.left);
        if(root.right != null)
            rdepth = depth(root.right);
        
        return Math.max(ldepth, rdepth) + 1;
        
    }
    
}
