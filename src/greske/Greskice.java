package greske;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Greskice {

    public static void main(String[] args) {

        /*    Scanner input = new Scanner(System.in);
       System.out.println("This is program that sums two numbers!");

        while (true) {

            try {

                System.out.println("Enter first operand: ");
                int x = input.nextInt();
                System.out.println("Enter second operand: ");
                int y = input.nextInt();
                System.out.println("Sum of numbers is: " + (x + y));

            } catch (InputMismatchException ex) {

                System.out.println("Only numbers can be summed, please enter numbers");
                input.next();
            }
            
    
        } */
        while (true) {

            try {

                Scanner scan = new Scanner(System.in);

                System.out.print("Enter first number: ");
                int x = Integer.valueOf(scan.nextLine());

                if (x == 0) {
                    break;
                }
                System.out.print("Enter second number: ");
                // int y = Integer.valueOf(scan.nextLine());
                int y = Integer.parseInt(scan.nextLine());
                System.out.println("Sum of numbers is: " + (x + y));

            } catch (java.lang.NumberFormatException e) {  //java.lang.NumberFormatException -----> InputMismatchException
                System.out.println("Only numbers can be summed, please enter number!");
            }

        }
    }
}

/*      while (true) {

            try {

                Scanner scan = new Scanner(System.in);

                System.out.print("Enter first number: ");
                int x = Integer.valueOf(scan.nextLine());

                    if(x == 0){
                    break;
                } 
                System.out.print("Enter second number: ");
                // int y = Integer.valueOf(scan.nextLine());
                int y = Integer.parseInt(scan.nextLine());
                System.out.println("Sum of numbers is: " + (x + y));

            } catch (InputMismatchException e) {
                System.out.println("Only numbers can be summed, please enter number!");
            }
        } */
