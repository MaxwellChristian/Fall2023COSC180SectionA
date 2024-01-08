package lo_io;

/*
* Input name of the directory from the user and if the directory exists,
*   list the absolute path of each file/directory in the provided directory
*   R : if the file is read only
*   D : if the file is a directory
*   timestamp the file was last modified
* */

import java.io.File;

public class ListDirContents {

    public static void main(String []args) {

        String path = "data_files";

        // check if the provided directory exists
        File dir = new File(path);

        if(dir.exists() && dir.isDirectory() ){

            for (File curFile: dir.listFiles()) {
                System.out.println(curFile.getAbsolutePath());
            }

        }
        else {
            System.out.println( path + ": No such directory exist");
        }

    }

}
