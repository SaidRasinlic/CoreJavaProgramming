package nizovi;

public class NewClass4 {

    public static void main(String[] args) {
        System.out.println("Numbers of an array: ");
        
        int[] array = {2, -5, -2, -50, 150, 54, 4, 12, 100, -300, 3253, -3999};
for(int mutant : array){
    System.out.print(mutant + ", ");
}
        
        int[] arrayPositive = new int[array.length];
        int[] arrayNegative = new int[array.length];
        
        int positive = 0;
        int negative = 0;

        for (int e : array) {
            if (e < 0) {
                arrayNegative[negative++] = e;
            } else {
                arrayPositive[positive++] = e;
            }
            
        }
        
        System.out.println("\nPositive numbers: ");
   for(int e : arrayPositive){
       System.out.print(e + ", ");
   }
        System.out.println("\nNegative numbers: ");
      for(int e : arrayNegative){
       System.out.print(e + ", ");
   }
   
   
   
    }
}

