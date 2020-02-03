package interfejsiTwo;


public class Dog implements FoodEater, NoiseMaker {

    @Override
    public void eat() {
        System.out.println("I am eating my food like a beast");
        
    }

    @Override
    public String makeNoise() {
        return "woof woof";
        
    }

}
