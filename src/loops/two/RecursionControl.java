package loops.two;

public class RecursionControl {

    public int value = 0;

    public static void counter(int start, RecursionControl stop) {
        System.out.println("HEy I am called" + stop.value);
        if (stop.value > start) {
            return;
        }
        ++stop.value;
        counter(start--, stop);
    }

    public static void main(String[] args) {
        RecursionControl stop = new RecursionControl();
        stop.value = 3; //3,4,5,6,7,8,9,10,11,12,13   | 

        int start = 12;//12,11,10,9,8,7,6,5,4,3,2     |
        counter(start, stop);
    }
}
