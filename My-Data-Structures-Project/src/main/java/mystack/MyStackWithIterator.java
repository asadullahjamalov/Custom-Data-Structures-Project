package mystack;

import java.util.Iterator;

public class MyStackWithIterator<T> implements Iterable {

    private Node firstNode;
    private int size;

    public MyStackWithIterator() {
        firstNode = new Node(null);
        size = 0;
    }

    public T push(T item) {

//        Stack
        Node newNode = new Node(item);
        Node current = firstNode;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
        size++;
        return item;
    }

    public T pop() {
        if (size > 0) {
            Node current = firstNode;
            int tempSize = size;
            while (tempSize > 1) {
                current = current.getNext();
                tempSize--;
            }
            Node<T> deletedNode = current.getNext();
            current.setNext(null);

            size--;
            return deletedNode.getValue();
        } else {
            System.out.println("There is no element to pop ");
            return null;
        }

    }

    public T peek() {
        if (size > 0) {
            Node current = firstNode;
            int tempSize = size;
            while (tempSize > 1) {
                current = current.getNext();
                tempSize--;
            }
            return (T) current.getNext().getValue();
        } else {
            System.out.println("There is no element to peek ");
            return null;
        }

    }

    @Override
    public Iterator iterator() {
//        return MyIterator<T>();
        return null;
    }

//    class MyIterator<T> implements Iterable<T>{
//
//    }


}
