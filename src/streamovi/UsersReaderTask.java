package streamovi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsersReaderTask {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos_out = new FileOutputStream("users.txt");
        BufferedOutputStream bos_out = new BufferedOutputStream(fos_out);
        DataOutputStream dos_out = new DataOutputStream(bos_out);
        dos_out.writeUTF("id:01|firstName:Petar|lastName:Petrovic|jmbg:1234567890123"
                + " id:02|firstName:Jovan|lastName:Jovanovic|jmbg:1234567890124"
                + " id:03|firstName:Nikola|lastName:Nikolic|jmbg:1234567890125");
        dos_out.close();

        FileInputStream fis = new FileInputStream("users.txt");

        BufferedInputStream bis = new BufferedInputStream(fis);

        DataInputStream dis = new DataInputStream(bis);

        try {

            while (true) {
                
              String x = dis.readUTF();
                parse(x);
                System.out.println(x);
        
            }
        } catch (EOFException e) {

            System.out.println("Stream finished");

        } finally {
            dis.close();
        }

        
        
        
        
        
        
        
        
    }
    
    
    public static void parse(String str){
       String [] array = str.split("|");
       
    }
    
    
    
    
}
