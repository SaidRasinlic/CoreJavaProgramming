package one;

public class Cars {

    private String name;
    private String color;
    private int age;
    private double fuelCap;
    String carModel;

    void Horn() {
        System.out.println("BEEP BEEEP");
    }

    Cars() {
        this.setColor("Red");
    }

    Cars(String c) {
        color = c;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {

        Cars car = new Cars("Blue");
        Cars car1 = new Cars("Black");
        System.out.println("The color of my BMW Car is:" + car.color + " and color of my Mercedes-Benz is:" + car1.color);
        Cars carOne = new Cars();
        System.out.println(carOne.getColor());
        Cars carTwo = new Cars("Orange");
        System.out.println("Color of carTwo is : " + carTwo.color);

        carTwo.carModel = "NISSAN GTR ";
        System.out.println(carTwo.carModel);
        carTwo.fuelCap = 121.12;

        System.out.println(carTwo.fuelCap);

        Cars one = new Cars();

        one.fuelCap = 311.21;
        System.out.println(one.fuelCap);
        
        
        one.name="said";
        System.out.println(one.name);

    }

}

