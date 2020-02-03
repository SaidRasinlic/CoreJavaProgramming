package interfejsiTwo;

public class BoxUser {
    public static void main(String[] args) {
        
    
     
 

    
    Box<String> saidovaKutija = new Box<>("Saidova kutija i opisuje je STRING");
    Box<Double> lamijinaKutija = new Box<>(23.0);
    Box<Person> senadovaKutija = new Box<>(new Person("Senad", "Rasinlic", Gender.MALE));
    
        System.out.println(saidovaKutija);

 String saidovProperty = saidovaKutija.getProperties();
 Double lamijinProperty =  lamijinaKutija.getProperties();
        System.out.println(saidovProperty);


}
}