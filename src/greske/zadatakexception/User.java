package greske.zadatakexception;

public class User {

    public int id;
    public String firstName;
    public String lastName;
    public String email;

    public User(int id, String firstName, String lastName, String email) throws InvalidEmailException, InvalidFirstNameException, InvalidLastNameException, InvalidIdException {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

        if (id > 100) {
            throw new InvalidIdException();

        } else if (firstName.isEmpty()) {
            throw new InvalidFirstNameException();

        } else if (lastName.isEmpty()) {
            throw new InvalidLastNameException();
        } else if (email.isEmpty()) {
            throw new InvalidEmailException();
        }

    }

    @Override
    public String toString() {
        return "ID number " + id + "\nFirst name: " + firstName + "\nLast name: " + lastName + "\nE-mail address: " + email;
    }

    public static void main(String[] args) throws InvalidEmailException, InvalidFirstNameException, InvalidLastNameException, InvalidIdException {

        User user1 = new User(10, "Said", "Rasinlic", "saidrasinlic.jr@gmail.com");
        user1.id = 50;

        System.out.println(user1);

        /*    try { 
       throw new InvalidEmailException();
       
   }catch(InvalidEmailException ex){
       System.out.println("Error text " + ex);
   } */
    }

}
