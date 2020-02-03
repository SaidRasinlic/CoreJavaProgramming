package greske;

import java.util.Arrays;

public class CalculatorExceptionTask {

    /*
     if(op.equals("+"))
            return a+b;
     else   if(op.equals("-"))
            return a-b;
    else   if(op.equals("*"))
            return a*b;
     else if(op.equals("/"))
            return a/b;
        return 0;
    }
     */
    
    
    static int calculate(int a, int b, String op) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                break;
        }
        return 0;
    }

    public static void main(String[] args) {

        try {
            int x = calculate(5, 0, "/");
            System.out.println(x);
        } catch (java.lang.ArithmeticException ex) {
            System.out.println(ex.getClass());
            System.out.println("Nije moguce dijeljenje sa nulom");
 

          }
        
       
        }

    }

