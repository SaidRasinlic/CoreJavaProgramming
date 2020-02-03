package loops.two;

import java.util.Scanner;

public class Loooop {

    public static void main(String[] args) {
Scanner reader = new Scanner(System.in);

        int numberDrawn = reader.nextInt();
        
        
          int i = 0;
        while (true) {
            System.out.println("Guess a number: ");
            int x = reader.nextInt();
            i++;
            if (x == numberDrawn) {
                break;
            } else if (x < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + i);
            } else {
                System.out.println("The number is lesser, guesses made: " + i);
            }
        }
        System.out.println("Congratulations, your guess is correct!");
    }
        
        
        
}
