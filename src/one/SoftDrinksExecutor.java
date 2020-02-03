package one;

public class SoftDrinksExecutor {

    static void addOneTo(int num) {
        num = num + 1;
        System.out.println(num + " u funkciji");
       
    }

    public static void main(String[] args) {
        SoftDrinks counter = new SoftDrinks();
        SoftDrinks counter1 = new SoftDrinks();
        System.out.println(counter.count);
        SoftDrinks cocacola = new SoftDrinks();
        cocacola.setColor("black");
        cocacola.setLitres(2);
        cocacola.setName("Coca Cola Zero");

        System.out.println("Color is: " + cocacola.getColor() + "\nName is: " + cocacola.getName() + "\nLitres: " + cocacola.getLitres() + " litres");

        // referenca klase   SoftDrinks.message("Said");
        // objekt     cocacola.openSound();
        int yz = cocacola.sum(2, 3);
        System.out.println(yz);

        SoftDrinks fanta = new SoftDrinks();
        System.out.println(fanta.getColor());
        SoftDrinks sprite = new SoftDrinks("green");
        System.out.println(sprite.getColor());

        int c = 7;

        addOneTo(c);
        System.out.println(c);

    }

}
