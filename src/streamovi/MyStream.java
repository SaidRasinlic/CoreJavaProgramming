package streamovi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MyStream extends OutputStream {

   @Override
    public void write(int b) throws IOException {
        System.out.println("Writing to stream " + Integer.toBinaryString(b));
    }
  

    public static void main(String[] args) throws IOException {

        MyStream ms = new MyStream();
        ms.write(1);
        
        //kreiramo text fajl na kompu i ispisuje hello

        FileOutputStream fos = new FileOutputStream("said.txt");
        fos.write(104);
        fos.write(101);
        fos.write(108);
        fos.write(108);
        fos.write(111);
      
        fos.close();

    }

}
