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
    public int rangeSumBST(TreeNode root, int L, int R) {
        
        int sum = 0;
        
        if(root == null) {
            return 0;
        }
        
        if(root.left == null && root.right == null) {
            return  (L <= root.val && root.val <= R ) ? root.val : 0;
        }
        
        sum +=  (L <= root.val && root.val <= R ) ? root.val : 0;
        
        sum += rangeSumBST(root.left, L, R);
        sum += rangeSumBST(root.right, L, R);
        
        return sum;
        
    }
}
