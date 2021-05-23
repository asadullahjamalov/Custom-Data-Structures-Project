package myqueue;

public class Main {
    public static void main(String[] args) {

        MyQueue<String> myQueue = new MyQueue<>();

        System.out.println("Enqueue operation");
        System.out.println(myQueue.enqueue("first in"));
        System.out.println(myQueue.enqueue("second in"));
        System.out.println(myQueue.enqueue("third in"));
        System.out.println(myQueue.enqueue("fourth in"));
        System.out.println(myQueue.enqueue("last in"));


        System.out.println("Dequeue operation");
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
    }
}
