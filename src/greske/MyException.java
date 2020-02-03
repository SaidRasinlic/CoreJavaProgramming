
package greske;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyException extends Exception {
/*public MyException(String s) { 
      
        super(s); 
    } 



    @Override
    public String toString() {
return getMessage();
        }
*/
    @Override
    public String getMessage() {
return "Its my own exception, BY : SAID ";
    }
    
    static void throwExec () throws MyException{
        throw new MyException();
    }
    static void throwingException (){
    throw new UncheckedEx();  //extends error klasa
}

    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
   try { 
       throw new MyException();
       
   }catch(MyException ex){
       System.out.println("Error text " + ex);
   }
        
        throwingException();
      
    /*   try {
           
            
            throwExec();
        } catch (MyException ex) {
            System.out.println("This same as regular");
            System.out.println("Custom text: " +ex);
            throwingException();       
        } */
        
    }
        
        
    /*
       try {
            throwExec();
        } catch (MyException ex) {
            Logger.getLogger(MyException.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    
    */
        
        
        
        
        
        
    }


