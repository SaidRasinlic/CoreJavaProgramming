package nizovi;

import java.util.Scanner;
import javax.swing.SpringLayout;

class VjezbaNizovi {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        /*String[] pojmovi = {"Bicycle", "Car", "Phone"};
        String[] nazivi = {"BMX", "Mercedes-Benz", "Huawei P30 Pro"};
        double[] cijene = {330.99, 89.999, 1299.99};
 for (int i = 0; i < pojmovi.length; i++) {
            System.out.println(nazivi[i] + " is type of " + pojmovi[i] + " and it costs " +"$" + cijene[i]);
 }
        System.out.println("\nThank you for programming this Said you are truly an amazing person and programmer!\nWish you all the best in the future!"); */
        int [] array = {2, -5, -2, -50, 150, 54, 4, 12, 100, -300, 3253, -3999};
        System.out.println("Numbers of an array: ");
        for (int mutant : array) {
            System.out.print(mutant + ", ");
        }

        int[] arrayPositive = new int[array.length];
        int[] arrayNegative = new int[array.length];

        int positive = 0;
        int negative = 0;

        for (int e : array) {
            if (e < 0) {
                arrayNegative[negative++] = e;
            } else {
                arrayPositive[positive++] = e;
            }

        }

        System.out.print("\nPositive numbers of an array: ");
        for (int mutant : arrayPositive) {
            System.out.print(mutant + ", ");
        }

        System.out.print("\nNegative numbers of an array are: ");
        for (int mutant : arrayNegative) {
            System.out.print(mutant + ", ");
        }

    }
}
