/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    if (head == null) return null;
    Node cur = head;
    Node fwd = null;
    Node rear;
    while (cur != null) {
        rear = cur.next;
        cur.next = fwd;
        fwd = cur;
        cur = rear;
    }
    
    return fwd;

}