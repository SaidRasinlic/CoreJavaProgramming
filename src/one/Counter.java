package one;

public class Counter {

   // int a;
    static int count = 0;
    Counter (){
        count ++;
    }
public static void horn (){
    System.out.println("BEEEEEP");
}
    /*void display(){
    int b = 0;
    a++;
    st++;
    b++;
    System.out.println("Instance a = " + a);
    System.out.println("Local b = " + b);
    System.out.println("static st = " + st);

     */
    public static void main(String[] args) {
        Counter c4 = new Counter();
        Counter.horn();
        
        Counter c1 = new Counter ();
          System.out.println(Counter.count);
        Counter c2 = new Counter ();
          System.out.println(Counter.count);
        Counter c3 = new Counter();
        
            
        
        System.out.println(Counter.count);
    }

}

   
  

     /*   Counter c1 = new Counter();
        c1.display();
        Counter c2 = new Counter();
        c2.display();
        System.out.println(Counter.st);*/

   
