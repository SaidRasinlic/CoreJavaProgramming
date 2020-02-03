package kolekcije;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionExecutor {

    public static void main(String[] args) {

        Collection<Double> collectionOfNumbers = new ArrayList<>();

        collectionOfNumbers.add(2.3);
        collectionOfNumbers.add(12.1);
        collectionOfNumbers.add(14.1);
        collectionOfNumbers.add(99.99);

        //   System.out.println(collectionOfNumbers);
        /*      for(Double collDouble : collectionOfNumbers) {
        if(collDouble==2.3){
            collectionOfNumbers.remove(2.3); // ERROR! ERROR! ERROR! ConcurrentModificationException 

/* for(Iterator<Double> imeIteratora = collectionOfNumbers.iterator(); imeIteratora.hasNext();){ 
   
     System.out.println(imeIteratora.next());
 } */
 /*        ZAPAMTI OVO MARK THIS SHIT BRATHAAAAAAA !!!!!!!
 
 while(imeIteratora.hasNext()){
     System.out.println(imeIteratora.next()); 
 
 
         

 */Iterator<Double> imeIteratora = collectionOfNumbers.iterator();
 imeIteratora.next();  
imeIteratora.remove();
        System.out.println(collectionOfNumbers); 
 
 
 
 
        
  /*      System.out.println(collectionOfNumbers);
        System.out.println("Lambda");
        collectionOfNumbers.removeIf(con -> con == 12.1); //  collectionOfNumbers.removeIf(con->{return con==12.1;});
        System.out.println(collectionOfNumbers);  */
    
    
    
    }
}



    




/* for(Iterator<Double>imeIteratora = collectionOfNumbers.iterator(); imeIteratora.hasNext();) {
       Double dodijeljenaVrijednost = imeIteratora.next();
       if(dodijeljenaVrijednost==2.3)
            
        imeIteratora.remove();
      
    }  */
