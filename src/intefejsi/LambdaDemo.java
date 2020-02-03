package intefejsi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

@FunctionalInterface
interface FuncInterface {

    // An abstract function 
    void abstractFun(int x);

    // A non-abstract (or default) function 
    default void normalFun() {
        System.out.println("Hello");
    }
}

public class LambdaDemo {

    public static void main(String[] args) {
        FuncInterface fobj = (int x) -> System.out.println(2 * x);

        // This calls above lambda expression and prints 10. 
        fobj.abstractFun(5);

        fobj.normalFun();

        ArrayList<Integer> listaBrojeva = new ArrayList<>();
        listaBrojeva.add(130);
        listaBrojeva.add(232);
        listaBrojeva.add(832);
        listaBrojeva.add(833);
        listaBrojeva.add(734);

        listaBrojeva.forEach(ime -> System.out.println(ime));

        listaBrojeva.forEach(ime -> {if (ime % 2 == 0) {System.out.println("Even nums: " + ime); }  });

    
        // listaBrojeva.forEach(it -> { if (it % 2 ==0){System.out.println(it);}});
        

    }

}

// jos jedan nacin klubovi.forEach(System.out::println);
/*
Lambdas Body:

klubovi.forEach(clubs->{
    System.out.println(clubs);
        });
 

 /*   LinkedList<String> klubovi = new LinkedList<>();
    klubovi.add("Man Utd");
    klubovi.add("Man City");
    klubovi.add("Chelsea");
    klubovi.add("Liverpool");
    klubovi.add("Tottenhem");
    klubovi.add("Arsenal");
klubovi.forEach(x -> System.out.println(x)); */
