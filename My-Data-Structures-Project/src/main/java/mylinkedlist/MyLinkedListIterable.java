package mylinkedlist;

import java.util.Iterator;
import java.util.Scanner;

public class MyLinkedListIterable<T> implements Iterable<T> {

    private Node head;
    private int size;

    public MyLinkedListIterable() {
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
            while (index >= 0) {
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
            while (index > 1) {
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
        String elements = "";
        while (current != null) {
            elements += "[" + current.getValue().toString() + "]-->";
            current = current.getNext();
        }
        return elements + "null";
    }


    @Override
    public Iterator<T> iterator() {
        return (Iterator<T>) new MyIteratorClass(head);
    }


    class MyIteratorClass implements Iterator<MyLinkedList> {

        Node<T> head;

        public MyIteratorClass(Node<T> head) {
            this.head = head;
        }

        @Override
        public boolean hasNext() {
            return head!=null;
        }

        @Override
        public MyLinkedList next() {
            return null;
        }

//        @Override
//        public Node<T> next() {
//            Node<T> temp = head;
//            head = head.getNext();
//            return temp;
//        }
    }

    public static void main(String[] args) {
        MyLinkedListIterable myLinkedList = new MyLinkedListIterable();
        for (var item : myLinkedList) {
            System.out.println(item.toString());
        }
    }


}

