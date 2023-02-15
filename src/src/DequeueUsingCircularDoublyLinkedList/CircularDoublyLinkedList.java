package src.DequeueUsingCircularDoublyLinkedList;

import src.Interface;

public class CircularDoublyLinkedList<E> implements Interface<E> {

  DoublyNode<E> dummy;


  CircularDoublyLinkedList() {
  
    dummy = new DoublyNode<>();
  }

  public void addFirst(E anItem) {
    // O(1)
    //DoublyNode aNewNode = new DoublyNode();
    dummy.data = anItem;

    if (dummy.next == null) {
      dummy.next = dummy;
      dummy.prev = dummy;

    } else {
      dummy.next = dummy.next;
      dummy.prev = dummy;

      dummy.next = dummy;
    }
  }
  
  

  void addLast(E anItem) {
    // O(1)
    DoublyNode aNewNode = new DoublyNode();
    aNewNode.data = anItem;

    if (back == null) {
      front = aNewNode; //
      back = aNewNode; //
    } else {
      back.next = aNewNode; // 1
      aNewNode.prev = back; // 2

      back = aNewNode; // 3
    }
  }

 public void removeFirst() {
    if (dummy.next != null) {
      DoublyNode<E> tmp = dummy.next;
      dummy.next = dummy.next.next;
      dummy.next.prev = null;

      tmp.next = null;
    }
  }

  public void removeLast() {
    if (back != null) {
      back = back.prev;
      back.next.prev = null;
      back.next = null;
    }
  }

  public void int getFirst() {
    // O(1)
    return front.data;
  }

  int getLast() {
    // O(1)
    return back.data;
  }

   /*public static void main(String[] args) {
   DequeueUsingDoublyLinkedList aDequeue = new DequeueUsingDoublyLinkedList();
    aDequeue.addFirst(1);
   aDequeue.addFirst(2);
   System.out.println(aDequeue.getLast()); // 1
   aDequeue.addLast(3);
   System.out.println(aDequeue.getFirst()); // 2
   }*/

}

}