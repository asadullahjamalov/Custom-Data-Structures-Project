package myqueue;

public class MyQueue<T> {

    private Node firstNode;
    private int size;

    public MyQueue() {
        firstNode = new Node(null);
        size = 0;
    }

    public T enqueue(T item) {

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

    public T dequeue() {
        if (size > 0) {
            Node current = firstNode;
            Node<T> deletedNode = current.getNext();
            firstNode = current.getNext();
            size--;
            return deletedNode.getValue();
        } else {
            System.out.println("There is no element to dequeue ");
            return null;
        }

    }

}
