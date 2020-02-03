package firstpackage.person;

import Instanciranje.Person;

public class UcenjeKlase {

    public static void main(String[] args) {
        Person.printCounter();

        Person unknownPerson1 = new Person("Said", "Rasinlic");
        Person unknownPerson2 = new Person("Lamija", "Rasinlic");
        unknownPerson1.printPerson();
        unknownPerson2.printPerson();
        unknownPerson1.printCounter();
        unknownPerson2.printCounter();
        Person unknownPerson3 = new Person ("Senad", "Rasinlic");
        unknownPerson3.printCounter();
    }

}
