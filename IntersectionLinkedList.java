/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode tempA = headA;
        ListNode tempB = headB;
        
        if(headA == null){
            return null;
        }
        
        if(headB == null){
            return null;
        }
        
        while(headA != null || headB != null){
            headB = tempB;
            while(headB != null){
                
                if(headA == headB){
                    return headA;
                }
                
                if(headA.next == headB){
                    return headB;
                }
                if(headA.next == headB.next){
                    return headA.next;
                }
                headB = headB.next;  
            }
            headA = headA.next;
        }
        return null;
        
    }
}
