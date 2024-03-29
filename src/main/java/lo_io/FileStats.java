package lo_io;

/*
* Write a program which will take a path/name of a location (file/dir) from
* the user and display
*   the size of the file (if a file)
*   display the count of files and directories (if a dir)
* the input is to be taken as command line argument
* */

import java.io.File;

public class FileStats {

    public static void main(String []args) {

        // System.out.println(Arrays.toString(args));

        // create the file object using the path from the command line argument
        File fObj = new File(args[0]);

        for (File curFile: fObj.listFiles()){
            if( curFile.isFile() ){
                System.out.println("F: " + curFile.getName() + " : " + curFile.length());
            } else {

                if( curFile.isDirectory() ){
                    int totalFiles = 0 ;
                    int totalDirs = 0 ;
                    for( File subContents: curFile.listFiles() ){
                        if( subContents.isFile() ){
                            totalFiles++;
                        } else {
                            if( subContents.isDirectory() ){
                                totalDirs++;
                            }
                        }
                    }

                    System.out.println("D: " + curFile.getName() + " : " + "Files: " + totalFiles + " : Dirs: " + totalDirs );
                }
            }
        }

    }

}
