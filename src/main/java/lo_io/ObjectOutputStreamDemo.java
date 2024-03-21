package lo_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        try ( // Create an output stream for file object.dat
              ObjectOutputStream output =
                      new ObjectOutputStream(new FileOutputStream("data_files/object.dat"));
        ) {
            // Write a string, double value, and object to the file
            output.writeUTF("Jamal");
            output.writeDouble(85.5);
            output.writeObject(new java.util.Date());
        }
    }

}
