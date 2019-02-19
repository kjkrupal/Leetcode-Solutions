/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        
        ListNode current = head;
        ListNode runner = head;
        
        while(true){
            if(runner.next != null){
                if(runner.next.next != null){
                    runner = runner.next.next;
                    current = current.next;
                }
                else{
                    return current.next;
                }
            }
            else{
                return current;
            }
        }
        
    }
}
