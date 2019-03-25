class Solution {
    
    public ListNode reverseBetween(ListNode head, int m, int n) {
       
        ListNode curr = head, prev = null;
        
        while(m > 1) {
            prev = curr;
            curr = curr.next;
            m--;
            n--;
        }
        
        ListNode con = prev, tail = curr;
        ListNode third = null;
        
        while(n > 0) {
            third = curr.next;
            curr.next = prev;
            prev = curr;
            curr = third;
            n--;
        }
        
        if(con != null) {
            con.next = prev;
        }
        else {
            head = prev;
        }
        
        tail.next = curr;
        return head;
        
        
       
    }
    
    
}
