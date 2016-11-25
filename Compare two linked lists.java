/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method
    if (headA == null && headB == null) return 1;
    if (headA == null) return 0;
    if (headB == null) return 0;
    
    Node pa = headA;
    Node pb = headB;
    
    while (pa != null && pb != null) {
        if (pa.data != pb.data) return 0;
        pa = pa.next;
        pb = pb.next;
    }
    
    if (pa == null && pb == null) return 1;
    else return 0;
  
}