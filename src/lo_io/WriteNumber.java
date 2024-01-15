package lo_io;

/*
 *
 * Write a program which can store random int values to a file.
 * The random int values should be provided using command line.
 * */

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class WriteNumber {

    public static void main(String[] args) {

        try (RandomAccessFile rafFile = new RandomAccessFile("data_files/random_file", "rw")) {

            // make sure that file is always having new numbers
            // i.e. erase the previous content

            rafFile.seek(0);

//            for (int counter = 1; counter <= 10; counter++) {
//                rafFile.writeInt(new Random().nextInt(1000));
//            }

            for (String token : args) {
                rafFile.writeInt(Integer.parseInt(token));
            }

            System.out.println("Length of the file: " + rafFile.length());

            // read and display the first number from the file
            rafFile.seek(0);
            System.out.println("First number: " + rafFile.readInt());

            // read and display the seventh number from the file
            rafFile.seek(6 * 4);
            System.out.println("Seventh number: " + rafFile.readInt());

            // change the seventh number to 77
            rafFile.seek(6 * 4);
            rafFile.writeInt(77);

            // change the first number to 11
            rafFile.seek(0);
            rafFile.writeInt(11);

            // read and display the first number from the file
            rafFile.seek(0);
            System.out.println("First number: " + rafFile.readInt());

            // read and display the seventh number from the file
            rafFile.seek(6 * 4);
            System.out.println("Seventh number: " + rafFile.readInt());

            // append 99 to the file
            // jump to the end of the file
            rafFile.seek(rafFile.length());
            // append the required number
            rafFile.writeInt(99);

            // display the new length of the file
            System.out.println("[New] Length of the file: " + rafFile.length());

            // display the last number
            rafFile.seek(rafFile.length() - 4);
            System.out.println("Last number: " + rafFile.readInt());

            // display all values from the file

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
