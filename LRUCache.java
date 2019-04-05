class LRUCache {

    private class Node {
        int key;
        int value;
        Node next;
        Node prev;
    }
    
    private Node head, tail;
    private int totalItems;
    private Map <Integer, Node> hashtable;
    private int maxCapacity;
    
    public LRUCache (int capacity) {
        head = new Node();
        tail = new Node();
        head.prev = null;
        head.next = tail;
        tail.prev = head;
        tail.next = null;
        maxCapacity = capacity;
        hashtable = new HashMap<>();
    }
    
    public int get(int key) {
        if(!hashtable.containsKey(key)) {
            return -1;
        }
        
        Node node = hashtable.get(key);
        moveToHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        
        if(!hashtable.containsKey(key)) {
            
            Node node = new Node();
            node.value = value;
            node.key = key;
            
            hashtable.put(key, node);
            ++totalItems;
            addNode(node);
            
        }
        
        else {
            hashtable.get(key).value = value;
            moveToHead(hashtable.get(key));
        }
        
        if(totalItems > maxCapacity) {
            removeLeastUsed();
        }
        
    }
    
    private void addNode(Node node) {
        Node currnext = head.next;
        node.next = currnext;
        currnext.prev = node;
        head.next = node;
        node.prev = head;
    }
    
    private void moveToHead(Node node) {
        
        if(node.prev == head) {
            return;
        }
        
        Node previous = node.prev;
        Node next = node.next;
        
        previous.next = next;
        next.prev = previous;
        
        addNode(node);
    }
    
    private void removeLeastUsed() {
        //printList();
        Node last = tail.prev;
        last.prev.next = tail;
        tail.prev = last.prev;
        hashtable.remove(last.key);
        last = null;
        --totalItems;
        
    }
    
    private void printList() {
        Node temp = head;
        
        while(temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
        
        temp = tail;
        
        while(temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.prev;
        }
        System.out.println();
        System.out.println();
        
    }
}
