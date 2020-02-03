package methodreferences;

@FunctionalInterface
interface Sum {

    // varijable su automatski  public static final int age = 55;
    public int mul(int a, int b);

    public static void staticMethod() {
        System.out.println("Hello from static method ");
    }

    default public void instanceMethod() {
        System.out.println("Hello from default method");

    }
}

public class MethodReferenceExample1 {

    public static void main(String[] args) {

        Sum result = (int a, int b) -> (a * b);
        result.instanceMethod();
        Sum.staticMethod();
        System.out.println(result.mul(4, 4));

        Thread t = new Thread(MethodReferenceExample1::printLine);  // MethodReferenceExample1 == () - > printMessage();
        t.start();

        Thread ime = new Thread(() -> printLine());
        ime.start();
    }

    public static void printLine() {
        System.out.println("Hello from the method reference thread!");
    }

}
