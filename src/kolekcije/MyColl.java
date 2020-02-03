package kolekcije;

import java.util.Iterator;

public class MyColl implements Iterable<Object> {

    String[] myCars = {"Mercedes Benz", "BMW", "Audi", "Hyundai", "Chevrolet", "Lamborghini", "Ferrari", "Nissan GTR"};
    int counter = 0;

    @Override
    public Iterator<Object> iterator() {
        return new Iterator<Object>() {

            @Override
            public boolean hasNext() {
                return counter < myCars.length;
            }

            @Override
            public Object next() {
                return myCars[counter++];
            }
        };

    }

    public static void main(String[] args) {

        MyColl kolekcija = new MyColl();
        for (Object o : kolekcija) {
            System.out.println(o);
        }

    }

}
