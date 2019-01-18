/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode merged = null;
        ListNode latest = null;
        int counter = 0;
        
        if(l1 == null && l2 != null){
            return l2;
        }
        
        if(l2 == null && l1 != null){
            return l1;
        }
        
        while(l1 != null && l2 != null){
            
            counter ++;
            
            if(l1.val < l2.val){
                ListNode node = new ListNode(l1.val);
                l1 = l1.next;
                
                if(counter == 1){
                    merged = node;
                    latest = node;
                    node.next = null;
                }
                else{
                    latest.next = node;
                    node.next = null;
                    latest = node;
                }
            }
            else if(l2.val < l1.val){
                ListNode node = new ListNode(l2.val);
                l2 = l2.next;
                
                if(counter == 1){
                    merged = node;
                    latest = node;
                    node.next = null;
                }
                else{
                    latest.next = node;
                    node.next = null;
                    latest = node;
                }
            }
            else{
                ListNode node1 = new ListNode(l1.val);
                ListNode node2 = new ListNode(l2.val);
                l1 = l1.next;
                l2 = l2.next;
                if(counter == 1){
                    merged = node1;
                    node1.next = node2;
                    node2.next = null;
                    latest = node2;
                    
                }
                else{
                    latest.next = node1;
                    node1.next = node2;
                    latest = node2;
                }
                 
            }
                
        }
        
        if(l1 == null && l2 != null){
            while(l2 != null){
                ListNode node = new ListNode(l2.val);
                l2 = l2.next;
                latest.next = node;
                node.next = null;
                latest = node;
            }
        }
        if(l1 != null && l2 == null){
            while(l1 != null){
                ListNode node = new ListNode(l1.val);
                l1 = l1.next;
                latest.next = node;
                node.next = null;
                latest = node;
            }
        }
        
        
        return merged;
    }
}
