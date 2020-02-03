
package intefejsi;


public interface IChampion {
    

    
   public void  recieveHit();
    public void primaryFire();
    public void secondaryFire();
    public static void staticMethod(){
        System.out.println("Hello from static method ");
    }
    default public void instanceMethod(){
        System.out.println("Hello from default method");
               
    }
}
