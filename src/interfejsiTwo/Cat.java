

package interfejsiTwo;


public class Cat implements FoodEater, NoiseMaker {

    @Override
    public void eat() {
        System.out.println("I am eating my food so cute");
    }

    @Override
    public String makeNoise() {
        return "meow meow";
    }

  

    
  
}
