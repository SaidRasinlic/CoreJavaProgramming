package intefejsi;

public class Interfaces {

    public static void main(String[] args) {

        UndeadMage mage = new UndeadMage();

        IChampion champion = new IChampion() {
            @Override
            public void recieveHit() {
                System.out.println("Hello from interface u hodu ");
            }

            @Override
            public void primaryFire() {
                System.out.println("Primary fire kreiran u hodu");
            }

            @Override
            public void secondaryFire() {
                System.out.println("I ja sam kreiran u hodu");
            }
        };
        champion.recieveHit();
        champion.primaryFire();
        champion.secondaryFire();
        champion.instanceMethod();
        IChampion.staticMethod();
        
        
        
    }

}
