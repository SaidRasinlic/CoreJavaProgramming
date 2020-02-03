package loops.two;

import java.io.IOException;

public class NewClass {

    public static void main(String[] args) throws InterruptedException, IOException {

        for (int j = 1; j <= 4; j++) {

            if (j == 1) {
                System.out.print("*");

            }
            if (j == 2) {

                System.out.print(" " + "*");
            }
            if (j == 3) {
                
                System.out.print(" " + " " + "*");

            }
            if (j == 4) {
                System.out.print(" " + " " + " " + "*");

            }
            Thread.sleep(300);
Runtime.getRuntime().exec("clear");
        }

    }

}
