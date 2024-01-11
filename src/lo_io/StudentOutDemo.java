package lo_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class StudentOutDemo {

    public static void main(String []args) {

        Student s1 = new Student(1, "Max", new Date());

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data_files/student.dat"));

            out.writeObject(s1);

            out.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
