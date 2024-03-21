package lo_io;

import java.io.*;
import java.util.Date;

public class StudentInDemo {

    public static void main(String []args) {

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data_files/student.dat"));

            Student s1 = (Student) in.readObject();
            System.out.println(s1);

            s1 = (Student) in.readObject();
            System.out.println(s1);

            s1 = (Student) in.readObject();
            System.out.println(s1);

            in.close();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
