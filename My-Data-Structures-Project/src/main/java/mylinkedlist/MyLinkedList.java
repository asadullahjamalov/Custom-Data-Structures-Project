package mylinkedlist;

import java.util.Scanner;

public class MyLinkedList<T> {

    private Node head;
    private int size;

    public MyLinkedList() {
        head = new Node(null);
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void add(T item) {
        Node newNode = new Node(item);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
        size++;
    }

    public void add(T item, int index) {
        if (index < size) {
            Node newNode = new Node(item);
            Node current = head;
            while (index > 0) {
                current = current.getNext();
                index--;
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            size++;
        } else if (index == size) {
            add(item);
        } else {
            System.out.println("There is not such index to add in MyLinkedList. " +
                    "Size of MyLinkedList is " + size);
            System.out.println("Please, enter index which is smaller than or equal " + size);
            Scanner scanner = new Scanner(System.in);
            int newIndex = scanner.nextInt();
            add(item, newIndex);
        }

    }

    public T get(int index) {
        if (index < size) {
            Node current = head;
            while (index > 0) {
                current = current.getNext();
                index--;
            }
            return (T) current.getValue();
        } else if (size == 0) {
            System.out.println("MyLinkedList is empty");
            return null;
        } else {
            System.out.println("There is not such index to get in MyLinkedList. " +
                    "Size of MyLinkedList is " + size);
            System.out.println("Please, enter index which is smaller than " + size);
            Scanner scanner = new Scanner(System.in);
            int newIndex = scanner.nextInt();
            return get(newIndex);
        }

    }

    public T remove(int index) {
        if (index < size) {
            Node current = head;
            while (index > 0) {
                current = current.getNext();
                index--;
            }
            Node removedNode = current.getNext();
            current.setNext(current.getNext().getNext());

            return (T) removedNode.getValue();
        } else if (size == 0) {
            System.out.println("MyLinkedList is empty");
            return null;
        } else {
            System.out.println("There is not such index to remove in MyLinkedList. " +
                    "Size of MyLinkedList is " + size);
            System.out.println("Please, enter index which is smaller than " + size);
            Scanner scanner = new Scanner(System.in);
            int newIndex = scanner.nextInt();
            return remove(newIndex);
        }

    }

    public int find(T item) {
        Node current = head;
        int index = 0;
        while (!item.equals(current.getValue()) && index < (this.size)) {
            current = current.getNext();
            index++;
        }
        if (index < size) {
            return index;
        } else {
            System.out.println("There is not such item in MyLinkedList. ");
            return -1;
        }
    }


    public String printMyLinkedList() {
        Node current = head.getNext();
//        System.out.println(head.getValue().toString());
        String elements = "";
        while (current != null) {
            elements += "[" + current.getValue().toString() + "]-->";
            current = current.getNext();
        }
        return elements + "null";
    }


}
