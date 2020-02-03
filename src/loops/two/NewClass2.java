
package loops.two;


public class NewClass2 {
    public static void main(String[] args) {
        
        
        char[] animationChars = new char[] {'|', '/', '-', '\\'};



    for (int i = 0; i < 100; i++) {
        System.out.print("Processing: " + i + "% " + animationChars[i % 4] + '\r');

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
        
        
        
        
        
        
        
        
        
        
        
    }



