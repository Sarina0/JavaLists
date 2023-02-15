package src.DequeueUsingLinkedList;

import src.Interface;

public class DequeueUsingLinkedList<E> implements Interface<E> {


  DoublyNode<E> dummy;


  DequeueUsingLinkedList() {
  
    dummy = new Node<>();
  }


@Override
public int getCurrentSize() {
  // TODO Auto-generated method stub
  return 0;
}

@Override
public boolean isEmpty() {
  // TODO Auto-generated method stub
  return false;
}

@Override
public void addFirst(E element) {
  // TODO Auto-generated method stub
  
}

@Override
public void addLast(E element) {
  // TODO Auto-generated method stub
  
}

  }