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

        final int CREATE_DIR = 1;
        final int CREATE_FILE = 2;

        // source path
        String sourcePath = "data_files";
        int fileType;
        String fileName;

        // name of the file to be created
        Scanner inputLine = new Scanner(System.in);

        System.out.print("Select the file type [1: Directory/2: File] : ");
        fileType = inputLine.nextInt();

        System.out.print("Enter the name of the new " + ((fileType == 1) ? "Directory" : "File")  + ": ");
        fileName = inputLine.next();

        switch (fileType) {
            case CREATE_DIR:
                createDirectory(sourcePath + "\\" + fileName);
                break;
            case CREATE_FILE:
                createFile(sourcePath + "\\" + fileName);
                break;
        }

    }

    private static void createFile(String path) {
        File fObj = new File(path);

        try {
            if (fObj.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("Something went wrong. File creation failed");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void createDirectory(String path) {
        File fObj = new File(path);
        if (fObj.mkdir()) {
            System.out.println("Directory created");
        } else {
            System.out.println("Something went wrong. Directory creation failed");
        }
    }

}
