/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        
        if(head != null && head.next != null){
            int temp = head.val;
            head.val = head.next.val;
            head.next.val = temp;
        }
        swapPairs(head.next.next);
        return head;
        
        
    }
}
