package lambdas;

public class NewClass {

    String id;
    String name;
    String score;

    static void parse(String id, String name, String score) {

    }

    public static void main(String[] args) {

        NewClass obj = new NewClass();

        NewClass.parse("sa", "wqw", "as");

        int result = Integer.parseInt("12121");			    // String to integer
        System.out.println(result);

        int ivar2 = 200;  // integer to String

        String str2 = Integer.toString(ivar2);
        System.out.println(str2);

        String test1 = Integer.toString(42424);
        System.out.println("Integer ide u String: " + test1);

        int test2 = Integer.valueOf("100");
        System.out.println("iz Stringa u integer " + test2);

    }
}
