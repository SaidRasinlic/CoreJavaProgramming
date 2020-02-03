package kolekcije;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestingSomeShit {

    public static void main(String[] args) {

        /* int[][] points = {{2, 4}, {1, 5}, {6, 6}, {3, 2}, {0, 0}};

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                System.out.print("*" + "a" + "*" + " ");

            }
            System.out.println("");
        } */
        Collection<String> clubs = new ArrayList<>();
        clubs.add("Manchester United");
        clubs.add("Barcelona");
        clubs.add("Real Madrid");
        clubs.add("Juventus");
        clubs.add("Milan");
        clubs.add("Inter");
        clubs.add("Liverpool");

     /*   Iterator<String> iterateMe = clubs.iterator();
        while(iterateMe.hasNext()){   // while there are more elements 
          System.out.println(iterateMe.next());
        } */ 
    
    for(Iterator<String>iteratMe = clubs.iterator(); iteratMe.hasNext();){
        System.out.println(iteratMe.next());
    }
        
        
        
        
        
        
        
        
        
    }
}
