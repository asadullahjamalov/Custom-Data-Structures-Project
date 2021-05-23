package myarraylist;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(8);
        myArrayList.add(9);
        myArrayList.add(10);
        myArrayList.add(11);
        myArrayList.add(12);
        myArrayList.add(13);
        myArrayList.add(14);
        myArrayList.add(15);
        myArrayList.add(16);

        myArrayList.add(12345, 8);

        myArrayList.print();

        System.out.println("Element at given index is "+myArrayList.get(6));

        System.out.println("Deleted item is "+myArrayList.remove(14));

        myArrayList.print();

        System.out.println("Found item is at "+myArrayList.find(12345));

    }
}
