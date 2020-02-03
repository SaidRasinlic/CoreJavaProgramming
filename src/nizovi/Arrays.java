package nizovi;

import java.util.Random;

public class Arrays {

    public static void main(String[] args) {

        String[] nizStringova = {"Jocker", "Melon", "Heart", "Cherry", "Coin"};
        System.out.println("Random combination is: \n");
        for (int i = 0; i < nizStringova.length; i++) {
            Random rand = new Random();
            int combination = rand.nextInt(nizStringova.length);

            
            System.out.println(nizStringova[combination]);

        }

    }
}
