package myqueue;

public class Node<T> {


    private T value;
    private Node nextNode;

    public Node(T value) {
        this.value = value;
        nextNode = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getNext() {
        return nextNode;
    }

    public void setNext(Node next) {
        this.nextNode = next;
    }
}
