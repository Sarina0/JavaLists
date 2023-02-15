package src.DequeueUsingCircularDoublyLinkedList;

public class DoublyNode<E> {
    
    E data;
    DoublyNode<E> next;
    DoublyNode<E> prev;
  
    DoublyNode() {
      next = null;  //  front
      prev = null;   // back
    }
    public DoublyNode(E element, DoublyNode<E> next, DoublyNode<E> prev) {
      this.data = element;
      this.next = next;
      this.prev = prev;
  }
  }
  
