package greske.zadatakexception;


public class InvalidEmailException extends Exception {

    @Override
    public String getMessage() {
        return "Invalid E-mail address, please fix it.";
    }

    @Override
    public String getLocalizedMessage() {
        return "Please check your e-mail!";
    }


    
    
}

