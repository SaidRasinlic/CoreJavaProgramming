package loops.two;

public class Game {

    public static void main(String[] args) throws InterruptedException {
        /* int printVar = 0;
        for (int i = 1; i <= 9; i++) {
            printVar++;
            for (int j = 1; j <= 9; j++) {
                printVar = (printVar > 9)
                        ? (printVar - 9) : printVar;
                System.out.print(printVar + " ");
                printVar++;
            }
    System.out.println("");
        } */

        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int num = i + j;

                if (num > 10) {
                    num = num - 9;
                }
                System.out.print(" " + num + " ");

            }
            System.out.println("");
        }

    }

}
