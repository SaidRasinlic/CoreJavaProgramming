package kolekcije.biblioteka;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestPurp {

    public TestPurp() {
    }

    public static void main(String[] args) {

        List<String> listOfVitamins = new ArrayList<>();

        listOfVitamins.add("Vitamin A");
        listOfVitamins.add("Vitamin B");
        listOfVitamins.add("Vitamin C");
        listOfVitamins.add("Vitamin D");
        
   /*   for(int i =0; i<listOfVitamins.size();i++){
          System.out.println(listOfVitamins.get(i));
      } */
   
   Iterator iter = listOfVitamins.iterator();  
while(iter.hasNext()){
    System.out.println(iter.next());
}
    }

}
