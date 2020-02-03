package one;

public class Vehicle {

    private int maxSpeed;
    private int wheels;
    private String color;
    private double fuelCapacity;

    Vehicle (){ this(32);
        System.out.println("Hello");
    }
    Vehicle (int a){
        System.out.println("what");  
    }
    public void horn() {
        System.out.println("BEEEEEP!");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }
    
            

    static void goodMorning() {
        System.out.println("Good Morning");

    }

    public static void main(String[] args) {
   Vehicle vehicle = new Vehicle();
   Vehicle vehicle1 = new Vehicle (42322);
        System.out.println(vehicle1.getWheels());
      





    }
}
