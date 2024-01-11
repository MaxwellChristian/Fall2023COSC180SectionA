package lo_io;

/*
* Write a program to save 10 numbers to a file using file stream
* */

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {

    public static void main(String []args) {

        int number = 129;

        try {
            // referring to the file
            DataOutputStream fOut = new DataOutputStream(new FileOutputStream(args[0]));

            fOut.writeInt(1098);
            fOut.writeDouble(157.98);
            fOut.writeUTF("Welcome");

            // close the file
            fOut.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
