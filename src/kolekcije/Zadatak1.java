package kolekcije;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Zadatak1 {

    public static void main(String[] args) {

        Collection<Integer> kolekcija = new ArrayList<>();

        kolekcija.add(10);
        kolekcija.add(20);
        kolekcija.add(30);
        kolekcija.add(40);
        kolekcija.add(50);

        Iterator<Integer> iterator = kolekcija.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        kolekcija.remove(10);
        kolekcija.remove(20);
        System.out.println(kolekcija);

    }

}
