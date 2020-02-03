package greske;

import java.util.Arrays;

public class GetInteger {

    static int divide(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (a > 10 || b > 10) {
            throw new ArithmeticException("Larger than 10");

        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
/*        try {
            throw new MyException();

        } catch (MyException ex) {
            System.err.print(ex);
            ex.getMessage();
          
        } */




        divide(6313,2);
        



    }

}
