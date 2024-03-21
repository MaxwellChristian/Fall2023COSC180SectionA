package lo_io;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class FetchFromURL {

    public static void main(String []args) {

        try {
            URL url = new URL("https://liveexample.pearsoncmg.com/data/Salary.txt");

            // Scanner scanner = new Scanner(new File("data_files/test2.txt"));
            Scanner scanner = new Scanner(url.openStream());

            while (scanner.hasNext()) {
                System.out.println( scanner.nextLine() );
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
