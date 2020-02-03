package streamovi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class DataStreamsClass implements Serializable {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileOutputStream fos = new FileOutputStream("testfile.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream dos = new DataOutputStream(bos);
        dos.writeInt(10);
        dos.writeFloat(15.5f);
        dos.writeChar(65);
        dos.close();

        FileInputStream fis_read = new FileInputStream("testfile.txt");
        BufferedInputStream bis_read = new BufferedInputStream(fis_read);
        DataInputStream dis_read = new DataInputStream(bis_read);

        try {

            while (true) {
                System.out.println(dis_read.readInt());
            }
        } catch (EOFException e) {

            System.out.println("Stream finished");

        } finally {
            dis_read.close();
        }

    }

}
