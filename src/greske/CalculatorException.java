package greske;

import java.util.Scanner;

public class CalculatorException {

    public static void main(String[] args) {

        System.out.println("This is a program that sums two numbers!");

        while (true) {

            try {

                Scanner scan = new Scanner(System.in);

                System.out.print("Enter first number: ");
                int x = Integer.valueOf(scan.nextLine());

                if (x == 0) {
                    break;
                }

                System.out.print("Enter second number: ");
                int y = Integer.valueOf(scan.nextLine());

                System.out.println("Sum of numbers is: " + (x + y));

            } catch (Exception e) {
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