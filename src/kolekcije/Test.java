package kolekcije;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import java.util.Set;

public class Test {

    public static void main(String[] args) {

        HashSet heroes_list = new HashSet<>();
        heroes_list.add("Said");
        heroes_list.add("Lamija");
        heroes_list.add("Senad");

        // kako doznajemo ni ova lista ne posjeduje metodu -contains-
   


        /*    System.out.println(heroes_list);

heroes_list.removeIf(unnamed ->unnamed.equals("Said"));
        //System.out.println(heroes_list); */
        Collection<String> list_Of_Strings = new HashSet<>();

        list_Of_Strings.add("Manchester United");
        list_Of_Strings.add("Manchester City");
        list_Of_Strings.add("Barcelona");

        list_Of_Strings.removeIf(e -> e.contains("celona"));

        
        System.out.println(list_Of_Strings);
        
        
        
        List typesOfPeople = new ArrayList<>();

        typesOfPeople.add("Millionaire");
        typesOfPeople.add("Thrillionaire");
        typesOfPeople.add("Zillionaire");
        typesOfPeople.add("Hundred-Thousandaire");

// kako doznajemo ArrayList-a nema contains metodu.
    }
}
