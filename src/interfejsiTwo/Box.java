package interfejsiTwo;

public class Box<S> {
// moze biti String,Person,Double, Int
    private S properties;
// konstruktor
    public Box( S properties) {
        this.properties=properties;
    }
  
//funkcija
    public S getProperties() {
        return properties;
    }
   
}
