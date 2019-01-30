/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head = null;
        ListNode prev = null;
        int a = 0;
        int b = 0;
        int carry = 0;
        
        while(l1 != null || l2 != null){
            if(l1 != null)
                a = l1.val;
            else
                a = 0;
            if(l2 != null)
                b = l2.val;
            else
                b = 0;
            
            int sum = a + b + carry;
            
            if(sum > 9)
                carry = 1;
            else
                carry = 0;
            
            int val = sum % 10;
            
            ListNode node = new ListNode(val);
            
            if(head == null){
                head = node;
                prev = node;
            }
            else{
                prev.next = node;
                prev = node;
            }
            
            node.next = null;
            
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
            
        }
        
        if(carry == 1){
            ListNode node = new ListNode(1);
            prev.next = node;
            node.next = null;
        }
        return head;
        
    }
}
