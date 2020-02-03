

package greske.zadatakexception;


public class InvalidIdException extends Exception{

    @Override
    public String getMessage() {
        return "Your ID is incorrect, please fix it.";
    }
    @Override
    public String getLocalizedMessage() {
        return "Please check your ID number!";
    }
    
    
    
    
    
}

