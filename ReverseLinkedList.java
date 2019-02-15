/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null)
            return head;
        
        if(head.next == null)
            return head;
        
        ListNode current = head.next;
        ListNode previous = head;
    
        while(current != null){
            ListNode next = current.next;
            ListNode temp = current;
            current.next = previous;
            current = next;
            previous = temp;
        }
        
        head.next = null;
        return previous;
        
        
    }
}
