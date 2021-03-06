class Node{
    Node next;
    int val;
    Node(int val){
        this.val = val;
    }      
}
class MyLinkedList {

    private Node head;
    private int size;
    
    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index > size - 1 || index < 0)
            return -1;
        int counter = 0;
        Node temp = head;
        while(counter != index){
            counter++;
            temp = temp.next;
        }
        return temp.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node node = new Node(val);
        temp.next = node;
        node.next = null;
        size++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index > size  || index < 0)
            return;
        int counter = 0;
        Node temp = head;
        while(counter != index - 1 && index - 1 > 0){
            temp = temp.next;
            counter++;
        }
        Node node = new Node(val);
        if(temp != null){
            node.next = temp.next;
            temp.next = node;
        }
        else{
            node.next = null;
            head = node;
        }
        
        size++;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index > size - 1  || index < 0)
            return;
        int counter = 0;
        Node temp = head;
        while(counter != index - 1){
            temp = temp.next;
            counter++;
        }
        
        temp.next = temp.next.next;
        size--;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
