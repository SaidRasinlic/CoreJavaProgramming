package one;

public class Brojac {
  private  double balance = 0;
    public void deposit (double x){
        if (x> 0)
            balance += x;
        System.out.println(balance);
        
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public int minFunc(int n1, int n2) {
        int min;
        if (n1 > n2) 
            min = n2;
        else
            min = n1;
        

        return min;

    }
    public static final double PI = 3.14;
    static int brojac = 0;
    static int pCount;

    public static void horn() {
        System.out.println("WAAZAZAZAZAZA");

    }

    Brojac() {
        brojac++;
    }

    public static void main(String[] args) {
        
           Brojac test1 = new Brojac();
test1.deposit(100);
test1.deposit(300);
                test1.deposit(100);
                
        test1.setBalance(600);
        System.out.println(test1.getBalance());
        
   
        
        
        
        
        
        
        
        
      /*  Brojac test = new Brojac();
        Brojac test1 = new Brojac();
        Brojac test2 = new Brojac();
        System.out.println(Brojac.brojac);
        Brojac.horn();
        Brojac.pCount = 1;
        Brojac.pCount++;

        System.out.println(Brojac.PI);

        System.out.println(test.minFunc(50, 100));
 */
    }

}
