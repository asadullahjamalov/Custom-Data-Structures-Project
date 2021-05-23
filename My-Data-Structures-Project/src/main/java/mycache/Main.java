package mycache;

public class Main {

    public static void main(String[] args) {

        LRUCache<String> myCache = new LRUCache(5);
        myCache.addElement("First");
        myCache.addElement("Second");
        myCache.addElement("Third");
        myCache.addElement("Fourth");
        myCache.addElement("Fifth");
        myCache.addElement("Sixth");
        myCache.addElement("Seventh");
        myCache.addElement("Eighth");

        System.out.println(myCache.getElement(8));
        System.out.println(myCache.getElement(4));

        System.out.println("-----------------");
        myCache.printAll();
    }
}
