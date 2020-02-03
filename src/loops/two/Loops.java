package loops.two;

public class Loops {

    static int recursiveFunction(int counter) {
        //System.out.println("Hello from recursion" + counter);
        if (counter == 1) {
            return 1;
        } else {
            return recursiveFunction(counter - 1) + counter;

        }

    }

    public static void main(String[] args) {
        System.out.println(recursiveFunction(4));

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*  System.out.println("*******************************");
        
           System.out.printf("%-10c%-10d%-10d%-10d\n", '#', 1, 2, 3);
               System.out.println("*******************************");
          
           
            
            for (int i = 1; i <= 10; ++i) {
         
                System.out.printf("%-10d", i);
  for(int j = 1; j<=3;++j){
       
       System.out.printf("%-10d", i* j);
   }  
               System.out.println("");  
            } 
 
 
 
 int x = 10;
 int y= 10;
 
      System.out.println("SAID ima: " + (x + y) + " godina");
            System.out.println("SAID ima: " + x + y + " godina"); */
        // recursiveFunction(10);
        /* recursiveFunction(2);
       recursiveFunction(7);
        recursiveFunction(6);
             recursiveFunction(5); */
 /*    recursiveFunction(4);
        recursiveFunction(3);
        recursiveFunction(2);
        recursiveFunction(1);
        recursiveFunction(0);
         recursiveFunction();
        recursiveFunction();
         recursiveFunction();
         recursiveFunction();
        recursiveFunction();
        recursiveFunction();
        recursiveFunction();
        recursiveFunction();
        recursiveFunction();
        recursiveFunction();
        recursiveFunction();
        recursiveFunction(); */
    }

}

/*
1         1         2         3         
2         2         4         6         
3         3         6         9         
4         4         8         12        
5         5         10        15        
6         6         12        18        
7         7         14        21        
8         8         16        24        
9         9         18        27        
10        10        20        30  

 for (int i = 1; i <= 10; ++i) {
         
           
        
            System.out.printf("%-10d", i);
            for (int j = 1; j <= 3; ++j) {
                System.out.printf("%-10d", i * j);
            }

                System.out.println("");
                   
           
           





 */
