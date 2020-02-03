package firstpackage.person;

import Instanciranje.Person;

public class Student extends Person {

    private int studentNumber;
    public Student (String name, String surname, int brojIndeksa) {
        super(name, surname);
    this.studentNumber = brojIndeksa;
            
            
            
            
     }

    public int getStudentNumber() {
        return studentNumber;
    }

    
    
    }


