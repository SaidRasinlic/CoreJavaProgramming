package javacorezadacisaidrasinlic;

import javacorezadacisaidrasinlic.Kalkulator;
import javacorezadacisaidrasinlic.Kalkulator;

public class KalkulatorExecutor {

    public static void main(String[] args) {
        //KONSTRUKTOR NASLJEĐENI IZ OBJECTA

        Kalkulator kalkulator = new Kalkulator(20.5, 20.5);
        double result = kalkulator.add();

        result = kalkulator.div();
        result = kalkulator.mul();
        result = kalkulator.sub();

        System.out.println(kalkulator.add());

        System.out.println(kalkulator.div());
        System.out.println(kalkulator.mul());
        System.out.println(kalkulator.sub());

    }
}
