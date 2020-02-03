package nizovi;

import java.util.Scanner;

public class NewClass2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers of elements ");
        int brojElemenata = input.nextInt();

        
        System.out.println("Enter numbers of an array: ");
         int[] array = new int[brojElemenata];
        for (int i =0; i < brojElemenata; ++i) {
            array[i] = input.nextInt();
        }

        int[] arrayPositive = new int[brojElemenata];
        int[] arrayNegative = new int[brojElemenata];

        int arrayPositiveSize = 0;
        int arrayNegativeSize = 0;
        for (int e : array) {
            if (e < 0) {
                arrayNegative[arrayNegativeSize++] = e;
            } else {
                arrayPositive[arrayPositiveSize++] = e;
            }
        }

        System.out.print("Positive numbers of an array: ");
        for (int e : arrayPositive) {
            System.out.print(e + " ");
        }

        System.out.print("\nNegative numbers of an array are: ");
        for (int e : arrayNegative) {
            System.out.print(e + " ");
        }

    }

}
