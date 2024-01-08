package lo_io;

/*
 * Write a program which inputs a
 *   name and a type from the user and
 *   creates a file/directory with the given name
 * */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCreationDemo {

    public static void main(String[] args) {


        // source path
        String sourcePath = "data_files";
        int fileType;
        String fileName;

        // name of the file to be created
        Scanner inputLine = new Scanner(System.in);

        System.out.print("Select the file type [1: Directory/2: File] : ");
        fileType = inputLine.nextInt();

        switch (fileType) {
            case 1:
                System.out.print("Enter the name of the new directory: ");
                fileName = inputLine.next();
                File fObj = new File(sourcePath + "\\" + fileName);
                if (fObj.mkdir()) {
                    System.out.println("Directory created");
                } else {
                    System.out.println("Something went wrong. Directory creation failed");
                }
                break;
            case 2:
                System.out.print("Enter the name of the new file: ");
                fileName = inputLine.next();
                File fObj2 = new File(sourcePath + "\\" + fileName);

                try {
                    if (fObj2.createNewFile()) {
                        System.out.println("File created");
                    } else {
                        System.out.println("Something went wrong. File creation failed");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                break;
        }


        File fObj = new File("src\\lo_io");


    }

}
