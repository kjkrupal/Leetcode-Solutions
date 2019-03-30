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
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        if(root == null)
            return list;
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        while(queue.size() != 0) {
            
            int level = queue.size();
            
            List<Integer> sub = new ArrayList<>();
            
            for(int i = 0; i < level; i++){
                TreeNode node = queue.peek();
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);    
                sub.add(queue.poll().val);
            }
            list.add(sub);
        }
        
        return list;
    }
    
}
