package loops.two;

public class BLAH {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // 1
            for (int j = 1; j < 10; j++) {  // 1
                //  int num = i + j ;
                System.out.print(" " + i + j + " ");

            }
            System.out.println("");
        }

    }
}

/* for(int i=1;i<10;i++){
            
            
            for(int j =1;j<=3;j++){
                System.out.print(j);
               
            }
            System.out.println("");
        } */
 /*     int num = 0;
        int reversenum = 0;
          System.out.println("Input your number and press enter: ");
      //This statement will capture the user input
      Scanner in = new Scanner(System.in);
      //Captured input would be stored in number num
      num = in.nextInt();
      //While Loop: Logic to find out the reverse number
      while( num != 0 )
      {
          reversenum = reversenum * 10;
          reversenum = reversenum + num%10;
          num = num/10;
      }

      System.out.println("Reverse of input number is: "+reversenum);  */
