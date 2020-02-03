package objektnoorijentisanoprogramiranje.person;

import com.sun.webkit.ContextMenu;

public class Professor extends Person {

    public String className;

    public Professor(String firstName, String lastName, String className) {
        super(firstName, lastName);
this.className=className;
    }

    @Override
    public void show() {
        System.out.println("Professor: " + firstName + " " + lastName + " " + className);
super.show();
    }
 
    public void show(String name){
        System.out.println(name);   
    }
    
    
    public static void main(String[] args) {

        Student student = new Student("Senad", "Rasinlic", "1992010119");
        Person person = new Person("Lamija", "Rasinlic");
        Professor professor = new Professor("Said", "Rasinlic", "The Greatest Class");
person.show();
student.show();
professor.show();
   
        
    }

}
