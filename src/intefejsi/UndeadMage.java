

package intefejsi;


public class UndeadMage implements IChampion{

    @Override
    public void recieveHit() {
        System.out.println("Im hit");   
    }

    @Override
    public void primaryFire() {
        System.out.println("Firing primary!");
    }

    @Override
    public void secondaryFire() {
        System.out.println("Firing secondary!");
    }

    
    
    
    
    
}

