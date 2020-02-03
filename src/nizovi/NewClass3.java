package nizovi;

public class NewClass3 {

    public static void main(String[] args) {
 int[] array = {2, -5, -2, -50, 150, 54, 4, 12};

     /*    for (int e : array) {
             System.out.println(e);
         }
        
        
        System.out.println("FOR INT");
        
        for(int i = 0;i< array.length;i++){
            System.out.println(array[i]);
        } */
     
     
     
         for (int e : array) {
            if (e < 0) {
                System.out.println(e);;
            } else if (e>0){
                System.out.println(e);
            }

        }
        
        
        
        
        
        
    }

}
