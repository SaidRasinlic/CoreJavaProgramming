package interfejsiTwo;

//import java.util.Locale;
import java.util.Scanner;

public class AnimalExecutor {

    public static void main(String[] args) {

        /*Cat cat = new Cat ();
       Dog dog = new Dog ();
        makeNoise(cat);
        eatFood(cat);
        makeNoise(dog);
        eatFood(dog);
        dogExecutor(dog);
    
    }
    static void dogExecutor(Dog dog){
        System.out.println("I am dog and I am proud");
        
    }
    static void makeNoise(NoiseMaker noiseMaker){
        System.out.println("NoiseMaker making noise: " + noiseMaker.makeNoise());
    }
static void eatFood(FoodEater foodEater){
    System.out.println("FoodEater eating food: ");
    foodEater.eat(); 
       
       
 
float a = 1.f / 81;
float b = 0;
for (int i = 0; i < 729; ++ i)
    b += a;
 System.out.printf("%.7g\n", b);
 
        System.out.println(" ");
 
double s = 1.0 / 81;
double r= 0;
for (int i = 0; i < 729; ++ i)
    r += s;
System.out.printf("%.15g\n", r); 


        System.out.println("IZ VECEG U MANJI");
        
 byte a, b;
int i=100, j=580;
a=(byte)i;
b=(byte)j;
System.out.println("i="+i+", j="+j+"\na="+a+", b="+b);
         */
// String sa strane pozivamo sa % onda razmak ako hocemo dodamo prvi broj 5 odnosno 5 praznih mjesta ili spaceova.
/*Zatim stavljamo tacku ako zelimo da ispisemo odredjeni broj karaktera odnosno slova u ovom slucaju to je broj 4 i stavljamo s 
kao znak za String, i %n znaci new line. Za Boolean je %b, za Integer je %d, za Char je %c  za formatiranje vremenea je %t
za Float je %f itd itd ... 


        System.out.printf ("Said je -%s!, ovo je furka%n" , "kralj");
        
       // System.out.printf("Simple Integer: %5.2f%n", 1213452);
                
       
System.out.printf("'%5.2e'%n", 5.1473);

//System.out.printf(Locale.US, "%,d %n", 10000);
//System.out.printf(Locale.ITALY, "%,d %n", 10000);

     //   System.out.printf("%,d %n", 1235241);
     
        System.out.printf("%,.2f%n" ,2.4642);
System.out.printf("'%e'%n", 5.1473);

double dexp = 12345678;
System.out.println("dexp: "+dexp);
double dexp1 = 12345678;
System.out.printf("dexp1: %.0f\n", dexp1);


//https://www.youtube.com/watch?v=R9OHn5ZF4Uo 

ZADACI SA PREDAVANJA 
        int x = 523134;
        int y = 325423;

        int result = x % y;

        if (result == 0) {
            System.out.println("OSTATAK NE POSTOJI");
        } else if (result > 1000) {
            System.out.println("OSTATAK VECI OD HILJADU");
        } else if (result < 1000) {
            System.out.println("OSTATAK MANJI OD HILJADU");
            
        }
        System.out.println("Ostatak dijeljenja x i y je: " + x%y); 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite operaciju koju zelite izvrsiti: ");
        char operation = scanner.next().charAt(0);
        System.out.println("Unesite dva operanda");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        switch (operation) {
            case '+':
                System.out.println("Rezultat je: " + (x + y));
                break;
            case '-':
                System.out.println("Rezultat je: " + (x - y));
                break;
            case '*':
                System.out.println("Rezultat je: " + (x * y));
                break;
            case '/':
                System.out.println("Rezultat je: " + (x / y));
                break;
            default:
                System.out.println("Unijeli ste nepoznatu operaciju"); */


       Scanner input = new Scanner(System.in);
        System.out.println("Unesite operaciju koju zelite izvrsiti: ");
        char operation = input.next().charAt(0);
        System.out.println("Unesite dva operanda");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if (operation == '+') {
            System.out.println("Rezultat je: " + (x + y));
        } else if (operation == '-') {
            System.out.println("Rezultat je: " + (x - y));
        } else if (operation == '*') {
            System.out.println("Rezultat je: " + (x * y));
        } else if (operation == '/') {
            System.out.println("Rezultat je: " + (x / y));
        } else {
            System.out.println("Unijeli ste nepoznatu operaciju");


        }
    }

}