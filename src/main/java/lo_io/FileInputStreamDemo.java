package lo_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

    public static void main(String []args) {

        try {
            FileInputStream fIn = new FileInputStream(args[0]);

            // read from the file
            int numberFromFile = fIn.read();
            while (numberFromFile != -1) {
                System.out.println("From file: " + numberFromFile);
                numberFromFile = fIn.read();
            }

            // close the file
            fIn.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
