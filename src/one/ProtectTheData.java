package one;

public class ProtectTheData {
    
    public static void main(String[] args) {
        
        SecretStuff myObject = new SecretStuff();
       // myObject.hiddenX = 20; // error
                        myObject.setHiddenX(20); // private encapsulation
        myObject.exposed=200; //easy peasy
        
        System.out.println("hiddenX = " + myObject.getHiddenX() + "; exposed = " + myObject.exposed);
        
     
        
        
      
        
      Brojac test = new Brojac();
    test.setBalance(3113);
        System.out.println(test.getBalance());
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    

}
