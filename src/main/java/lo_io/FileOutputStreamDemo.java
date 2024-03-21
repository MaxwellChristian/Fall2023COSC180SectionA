package lo_io;

/*
* Write a program to save 10 numbers to a file using file stream
* */

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

    public static void main(String []args) {

        int number = 129;

        try {
            // referring to the file
            FileOutputStream fOut = new FileOutputStream(args[0]);

            fOut.write(10);
            fOut.write(1098);
            fOut.write(57810);
            fOut.write(110);

            // close the file
            fOut.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
