
package streamovi;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ClassFileReader {
    
    
  
          public static void main(String[] args ) throws IOException  {
    
        
    
    
    FileWriter fw = new FileWriter("said.txt");
    
    fw.write("Hello world, how you doing... :D");
    
        fw.close();
        
              FileReader fr = new FileReader("said.txt");
          int b;
          
while((b=fr.read() )!=-1){
    System.out.println((char)b);
}
       fr.close();
          
    }

}

