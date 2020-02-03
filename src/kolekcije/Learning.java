package kolekcije;

import java.util.ArrayList;


public class Learning {

    public static void main(String[] args) {

        /*ArrayList klubovi = new ArrayList();
        klubovi.add("Manchester United");
        klubovi.add("Manchester City");
        klubovi.add("Chelsea");
        klubovi.add("Arsenal");
        klubovi.add("Liverpool");
        klubovi.add("Tottenhem");
        klubovi.add("14.01.2000");
klubovi.removeIf(mutant->mutant.equals("14.01.2000"));

        System.out.println(klubovi); */
        
        
  
        ArrayList someRandomShit = new ArrayList ();
        someRandomShit.add("Whats Up !");
        someRandomShit.add("We gonna make it!");
        someRandomShit.add("You know what I mean!");
        someRandomShit.set(0, "Hello Sir, how can I be of help to you?");
        for(int i = 0; i <someRandomShit.size();i++){
            System.out.println(someRandomShit.get(i));
        }
                
         
        
    }
    
}
