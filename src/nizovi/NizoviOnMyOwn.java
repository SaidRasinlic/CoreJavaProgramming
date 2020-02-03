package nizovi;

import java.util.Scanner;

public class NizoviOnMyOwn {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite broj elemenata: ");
        int elementsOfAnArray = scanner.nextInt();
        
           int[] array = new int[elementsOfAnArray];
           
        System.out.println("Unesite brojeve niza: ");
        for (int i = 0; i < elementsOfAnArray; i++) {
            array[i] = scanner.nextInt();
        }

        int[] positiveNumbers = new int[elementsOfAnArray];
        int[] negativeNumbers = new int[elementsOfAnArray];

        int positive = 0;
        int negative = 0;

        for (int mutant : array) {
            if (mutant < 0) {
                negativeNumbers[negative++] = mutant;
            } else {
                positiveNumbers[positive++] = mutant;

            }
        }
        System.out.println("Pozitivni brojevi su: ");
        for (int mutant : positiveNumbers) {
            System.out.print(mutant + ", ");
        }

        System.out.println("\nNegativni brojevi su: ");
        for (int mutant : negativeNumbers) {
            System.out.print( mutant + ", ");
        }
    }

}
