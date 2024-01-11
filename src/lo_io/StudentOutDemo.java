package lo_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class StudentOutDemo {

    public static void main(String []args) {

        Student s1 = new Student(1, "Max", new Date());
        Student s2 = new Student(2, "ABC", new Date());
        Student s3 = new Student(3, "DEF", new Date());

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data_files/student.dat"));

            out.writeObject(s1);
            out.writeObject(s2);
            out.writeObject(s3);

            out.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
