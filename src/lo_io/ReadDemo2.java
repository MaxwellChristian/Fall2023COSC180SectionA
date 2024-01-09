package lo_io;

/*
* Write a program which takes input of a file name using command line and
*   displays the text, number and number from the CSV content of the file.
* */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDemo2 {

    public static void main(String []args) {

        try {
            // create a file object as per provided path
            File file = new File(args[0]);

            // connect a scanner to the file
            Scanner scanner = new Scanner(file);

            // read a line using the scanner
            String csvLine = scanner.nextLine();

            // display the fetched content (from file)
            System.out.println("Data from file: " + csvLine );

            String[] tokens = csvLine.split(",");
            System.out.println("Text: " + tokens[0]);
            System.out.println("Number 1: " + tokens[1]);
            System.out.println("Number 2: " + tokens[2]);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Please provide a file name in argument");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }

}
