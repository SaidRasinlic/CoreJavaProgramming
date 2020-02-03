package one;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MainClass {

    static void test(int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {

        String enterNum = JOptionPane.showInputDialog("Please enter a week day number");
        int enteredNum = Integer.parseInt(enterNum);

        switch (enteredNum) {
            case 1:
                System.out.println("Day you entered is 1 and it belongs to: Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid input");
                break;

        }

    }
}
