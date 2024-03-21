package lo_io;

/*
* Input name of the directory from the user and if the directory exists,
*   list the absolute path of each file/directory in the provided directory
*   R : if the file is read only
*   D : if the file is a directory
*   timestamp the file was last modified
* */

import java.io.File;
import java.util.Date;

public class ListDirContents {

    public static void main(String []args) {

        String path = "data_files";

        // check if the provided directory exists
        File dir = new File(path);

        if(dir.exists() && dir.isDirectory() ){

            for (File curFile: dir.listFiles()) {

                // absolute path
                System.out.print(curFile.getAbsolutePath());
                System.out.print("-");

                // is the file read only
                if( ! curFile.canWrite() ){
                    System.out.print("-");
                    System.out.print("R");
                    System.out.print("-");
                }

                // is the file a directory
                if( curFile.isDirectory() ){
                    System.out.print("-");
                    System.out.print("D");
                    System.out.print("-");
                }

                // last modified timestamp
//                System.out.print(curFile.lastModified());

                Date d = new Date(curFile.lastModified());
                System.out.print(d);

                System.out.println();

            }

        }
        else {
            System.out.println( path + ": No such directory exist");
        }

    }

}
