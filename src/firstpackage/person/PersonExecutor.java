package firstpackage.person;

import Instanciranje.Person;

public class PersonExecutor {

    public static void main(String[] args) {

        Person p1 = new Person("Lamija", "Rasinlic");
        Person p2 = new Student("Said", "Rasinlic", 19);
        

    }
    static String checkPerson (Person p) {
// instanceOf funkcija 
if (p instanceof Student) {
    return "STUDENT";
  
}else if (p instanceof Teacher) {
    return "TEACHER";
    
}else{
    return "OBICNA PERSONA";
}
}
}
