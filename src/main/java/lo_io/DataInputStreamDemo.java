package lo_io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamDemo {

    public static void main(String []args) {

        try {
            DataInputStream fIn = new DataInputStream(new FileInputStream(args[0]));

            // read from the file
//            fOut.writeInt(1098);
//            fOut.writeDouble(157.98);
//            fOut.writeUTF("Welcome");

            System.out.println(fIn.readInt());
            System.out.println(fIn.readDouble());
            System.out.println(fIn.readUTF());

            // close the file
            fIn.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
