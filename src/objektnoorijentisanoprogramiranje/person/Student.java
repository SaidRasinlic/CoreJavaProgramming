package objektnoorijentisanoprogramiranje.person;

public class Student extends Person {

    public String indexNumber;

    public Student(String firstName, String lastName, String indexNumber) {
        super(firstName, lastName);
        this.indexNumber = indexNumber;
    }
    
    @Override
    public void show() {
        System.out.println("Student: " + firstName + " "  + lastName + " " + indexNumber);
super.show();
    }  

    @Override
    public String toString() {
       return "Hello from " + firstName;  
    }

    
    
    public static void main(String[] args) {
        
    Student st = new Student("Said", "Rasinlic", "1401000170109");
        System.out.println(st);
   st.show();
        
    }
    
    
    
}
