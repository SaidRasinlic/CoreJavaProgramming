package zadatakgender;

import java.awt.BorderLayout;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class PersonExecutor {

    public static void main(String[] args) {
      List<Person> persons = Person.socialNetwork();
        PersonExecutor personExecutor = new PersonExecutor();
        personExecutor.printPersonsWithGender(persons, Gender.MALE);
        personExecutor.printPersonsWithGender(persons, Gender.FEMALE);
        personExecutor.printPersonsOlderThan(persons, LocalDate.of(1991, Month.JANUARY, 1));
       

    }

    static void printPersonsWithGender(List<Person> persons, Gender gender) {
        for (int i = 0; i < persons.size(); i++) {
            Person p = persons.get(i);
            if (p.getGender().equals(gender)) {
                System.out.println(p);
            }
        }
    }

    void printPersonsOlderThan (List<Person> persons, LocalDate date) {

        for (Person p : persons) {
            if (p.getBirthday().isBefore(date)) {
                System.out.println("STARI DOBRI ");
            }

        }

    }

    void printPersonYoungerThan (List<Person> persons, LocalDate date ){
        
        
        
        persons.forEach(it->System.out.println(it));
         //  for (Person p  : persons) {
           //    if (p.getBirthday().isAfter(date)){
             //      System.out.println("MLADI");
               }
                
           }
    
    
    
