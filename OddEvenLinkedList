class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        
        int count = 0;
        
        ListNode odd_tail = head;
        ListNode even_tail = head.next;
        ListNode even_head = head.next;
        ListNode current = head.next.next;
        
        while(current != null){
            
            if(count % 2 == 0){
                odd_tail.next = current;
                even_tail.next = current.next;
                current.next = even_tail;
                current = even_tail.next;
                odd_tail = odd_tail.next;
                even_tail = even_tail.next;
                odd_tail.next = even_head;
            }
            else{
                current = current.next;
            }
            count ++;
            
        }
        
        return head;
    }
}
