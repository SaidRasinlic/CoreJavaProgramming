package nizovi;

public class Kopiranje {

    public static void main(String[] args) {

        /*   int [] A = {1,2,3};
        int [] B = {4,5,6};
        int [] C = new int [A.length];
       for(int i = 0; i < A.length; i++){
         
           C[i]=A[i] + B[i];
            System.out.println(C[i]);*/
 /*int[] array = {23, 43, 55};
int[] copiedArray = new int[array.length];


    
System.arraycopy(array, 0, copiedArray, 0, 3);

       System.out.println(copiedArray[0]);  //23
        System.out.println(copiedArray[1]); // 43
          System.out.println(copiedArray[2]);   // 0*/

 /*int[] a = {1, 2, 3};
int[] b = {4, 5, 6};
int[] c = new int[a.length];
for (int i = 0; i < a.length; ++i) {
    c[i] = a[i] + b[i];
    System.out.println(c[i]);
} 
        int[] niz = {10, 20, 30};
        int[] niz2 = {100, 200, 300};
        int[] suma = new int[niz.length];

        for (int i = 0; i < niz.length; i++) {
            suma[i] = niz[i] + niz2[i];
            System.out.println(suma[i]);
        } */

        String[] cities = {"Mekkah","Istanbul","Morocco","Medina","Jerusalem"};
        for (String city : cities) {
            System.out.println(city);
        }
        System.out.println(" ");
        
        String [] countries ={"Bosnia and Herzegovina", "Turkey", "Iran", "Iraq", "Azerbaijan"};
        int count =0;
        while(count<countries.length){
            System.out.println(countries[count++]);
        }
        
    }
}
