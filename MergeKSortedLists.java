class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue <Integer> queue = new PriorityQueue<>();
        
        for(int i = 0; i < lists.length; i++) {
            ListNode head = lists[i];
            while(head != null) {
                queue.add(head.val);
                head = head.next;
            }
        }
        
        ListNode head = null;
        ListNode temp = head;
        
        int size = queue.size();
        
        for(int i = 0; i < size; i++) {
            
            if(head == null) {
                head = new ListNode(queue.poll());
                temp = head;
            }
            else {
                ListNode node = new ListNode(queue.poll());
                temp.next = node;
                temp = node;
            }
        }
        
        return head;
    }
}
