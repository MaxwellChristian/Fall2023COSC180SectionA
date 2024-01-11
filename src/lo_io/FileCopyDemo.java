package lo_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {

    public static void main(String []args) {

        try {
            FileInputStream fIn = new FileInputStream(args[0]);
            FileOutputStream fOut = new FileOutputStream(args[1]);

            // read from the file
            int byteFromFile = fIn.read();
            while (byteFromFile != -1) {
                fOut.write(byteFromFile);
            }

            // close the file
            fOut.close();
            fIn.close();

            System.out.println("File copied");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
