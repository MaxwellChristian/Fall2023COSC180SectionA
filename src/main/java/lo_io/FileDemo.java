package lo_io;

import java.io.File;

public class FileDemo {

    public static void main(String []args) {

//        File fObj = new File("C:\\Users\\user1\\folder1\\PPTs\\1-Exceptions") ;
//        File fObj = new File("data_files") ;
//        File fObj = new File("src") ;
        File fObj = new File("src\\lo_io") ;

        // display a message which shows where the file at the path is
        // an ordinary file or a directory

        // check if the file exists at the given path
        if( fObj.exists() ){

            if( fObj.isDirectory() ){
                System.out.println("Provided path : Directory");
            }

            if( fObj.isFile() ){
                System.out.println("Provided path : File");
            }

        }
        else {
            System.out.println("Provided path does not exist");
        }

    }

}
