package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedStack<T> implements Iterable<T> {

  private Node<T> head;
  private int size;

  private static class Node<T> {
    T item;
    Node<T> next;

    Node(T item, Node<T> next) {
      this.item = item;
      this.next = next;
    }
  }

  public void push(T item) {
    head = new Node<>(item, head);
    size++;
  }

  public T pop() {
    if (head == null) throw new NoSuchElementException("Stack underflow");
    T item = head.item;
    head = head.next;
    size--;
    return item;
  }

  public T peek() {
    if (head == null) throw new NoSuchElementException("Stack underflow");
    return head.item;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public int size() {
    return size;
  }

  @Override
  public Iterator<T> iterator() {
    return new StackIterator(head); 
  }

  class StackIterator implements Iterator<T> {
    private Node<T> current;

    public StackIterator(Node<T> head) {
      current = head;
    }

    @Override
    public boolean hasNext() {
      return current != null;
    }

    @Override
    public T next() {
      if (current == null) throw new NoSuchElementException();
      T item = current.item;
      current = current.next;
      return item;
    }
  }
}


