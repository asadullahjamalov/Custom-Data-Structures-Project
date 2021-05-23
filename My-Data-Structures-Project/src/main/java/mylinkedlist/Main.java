package mylinkedlist;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();

        myList.add("Node 0");
        myList.add("Node 1");
        myList.add("Node 2");
        myList.add("Node 3");
        myList.add("Node 4");
        myList.add("Node 5");

        System.out.println("MyLinkedList has " + myList.getSize() + " nodes");
        System.out.println("Nodes: " + myList.printMyLinkedList());

        System.out.println("I removed " + myList.remove(0).toString());
        System.out.println("Nodes: " + myList.printMyLinkedList());

        System.out.println("I added new node");
        myList.add("New Node", 3);
        System.out.println("Nodes: " + myList.printMyLinkedList());

        System.out.println("Searched item located at index " + myList.find("Node 4"));

    }
}
