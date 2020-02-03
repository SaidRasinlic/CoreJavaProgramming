package six.calculator;

public class Sumator {
    // ovo je funkcija

    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public double add(double a, double b) {
        double result = a + b;
        return result;
    }

    public int add(int a1, int a2, int a3) {
        int result = a1 + a2 + a3;
        return result;
    }
// ... su varargs koncept varijabilnih argumenata vezano za result1 u executoru

    public int useVarrags(int... params) {
        int sum = 0;
        for (int mutant : params) {
            sum = sum + mutant;

        }
        return sum;
    }
}
