
package objektnoorijentisanoprogramiranje.person;

public  class Person {
    
    
    String firstName;
    String lastName;
    
    public Person(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    
    public void show(){
        System.out.println("Person: " + firstName + " " + lastName);
    }
    
    
    

}


