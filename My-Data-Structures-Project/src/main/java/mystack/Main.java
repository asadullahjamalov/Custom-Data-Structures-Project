package mystack;

public class Main {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();

        System.out.println("Push operation");
        System.out.println(myStack.push("first in"));
        System.out.println(myStack.push("second in"));
        System.out.println(myStack.push("third in"));
        myStack.pop();
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.push("fourth in"));
        System.out.println(myStack.push("last in"));

        System.out.println("Peek operation");
        System.out.println(myStack.peek());

        System.out.println("Pop operation");
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());


    }
}
