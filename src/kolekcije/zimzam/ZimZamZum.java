package kolekcije.zimzam;

import java.util.Random;
import java.util.Scanner;

public class ZimZamZum {

    public static void main(String[] args) {
        
        
       
        Scanner input = new Scanner(System.in);
        
         Random racunar = new Random();
        
        Statistika statistika = new Statistika();
        
        while (true) {
            System.out.println("1. Kamen\n2. Makaze\n3. Papir\n4. Statistika");
            System.out.println("Unesite broj od 1 do 3: ");
            
            int korisnik = input.nextInt();
            if (korisnik == 4) {
                statistika.ispisiStatistiku();
                continue;
            }
            if (korisnik != 1 && korisnik != 2 && korisnik != 3) {
                break;
            }
            
            statistika.rezultat(korisnik -1, racunar.nextInt(3));
        }
        
        statistika.ispisiStatistiku();
   
    }
}
