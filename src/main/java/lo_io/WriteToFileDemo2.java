package lo_io;

/*
 * Write a program which takes input of a phrase from the user and saves that
 * to a file. Input the file path to save through command line.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFileDemo2 {

    public static void main(String[] args) {

        if (args.length == 1) {

            // create a file object using the path specified in the command line
            File fileObj = new File(args[0]);

            // use an appropriate writer to save the data to the file
            PrintWriter printWriter = null;
            try {
                // opening the file using a print writer
                printWriter = new PrintWriter(fileObj);

                // writing (printing) the output to the file
                printWriter.printf("%s, ", "Welcome");
                printWriter.printf("%d, ", 15);
                printWriter.printf("%d\n", 91);

            } catch (FileNotFoundException e) {
                System.out.println("Something went wrong when saving data to file: " + e.getMessage());
            } finally {
                // close the file when completed
                if( printWriter != null ){
                    printWriter.close();
                }
            }

//            try( PrintWriter printWriter2 = new PrintWriter(fileObj) ){
//                // opening the file using a print writer
//                printWriter = new PrintWriter(fileObj);
//
//                // writing (printing) the output to the file
//                printWriter.println(text);
//            } catch (FileNotFoundException ex) {
//
        } else {
            System.out.println("Provide a file path in command line");
        }
    }

}
