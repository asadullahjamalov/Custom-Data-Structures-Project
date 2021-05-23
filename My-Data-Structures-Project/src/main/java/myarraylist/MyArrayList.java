package myarraylist;


public class MyArrayList<T> {

    private int length = 10;
    private T[] array = (T[]) new Object[length];
    private int currentLength = 0;

    public int getLength() {
        return this.length;
    }

    public void print() {
        for (int i = 0; i < currentLength; i++) {
            System.out.println(this.array[i]);
        }
    }


    public void add(T item) {
        if (currentLength < getLength()) {
            array[currentLength] = item;
            currentLength++;
        } else {
            T[] newArray = (T[]) new Object[getLength() * 2];
            for (int i = 0; i < this.getLength(); i++) {
                newArray[i] = this.array[i];
            }
            this.array = newArray;
            this.length = this.length * 2;
            array[currentLength] = item;
            currentLength++;
        }
    }


    public void add(T item, int index) {
        if (index == getLength()) {
            add(item);
        } else if (index < getLength()) {
            T[] newArray = (T[]) new Object[getLength()];

            for (int i = 0; i < index; i++) {
                newArray[i] = this.array[i];
            }
            newArray[index] = item;
            for (int i = index + 1; i < this.getLength(); i++) {
                newArray[i] = this.array[i - 1];
            }

            this.array = newArray;
            currentLength++;
        } else {
            System.out.println("Please enter index between 0-" + currentLength);
        }
    }

    public T get(int index) {
        if (index < getLength()) {
            return this.array[index];
        } else {
            System.out.println("Such index does not exist");
            return null;
        }
    }

    public T remove(int index) {
        if (index >= getLength()) {
            System.out.println("Such index does not exist ");
            return null;
        } else {
            T[] newArray = (T[]) new Object[getLength()];

            for (int i = 0; i < index; i++) {
                newArray[i] = this.array[i];
            }

            for (int i = index + 1; i < this.getLength(); i++) {
                newArray[i - 1] = this.array[i];
            }

            T deletedItem = array[index];

            this.array = newArray;

            currentLength--;

            return deletedItem;
        }
    }

    public int find(T item) {
        for (int i = 0; i < currentLength; i++) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }


//    @Override
//        public Iterator<T> iterator() {
//            return new MyArrayList.MyIteratorClass(T[] array);
//        }
//
//
//        class MyIteratorClass implements Iterator<T> {
//
//            int size;
//
//            public MyIteratorClass(int size) {
//                this.size = size;
//            }
//
//            @Override
//            public boolean hasNext() {
//                return size > 0;
//            }
//
//        @Override
//        public MyArrayList next() {
//            size--;
//            return this.next();
//        }
//    }

//    public void add(T item, int index) {
//        if (currentLength < length) {
//            array[currentLength] = item;
//            currentLength++;
//        } else {
//            T[] newArray = (T[]) new Object[doubleLength()];
//            for (int i = 0; i < this.array.length; i++) {
//                newArray[i] = this.array[i];
//            }
//            this.add(item);
//            currentLength++;
//        }
//    }


}
