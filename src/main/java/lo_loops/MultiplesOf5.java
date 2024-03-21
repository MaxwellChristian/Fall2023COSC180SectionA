package lo_loops;

import java.util.Scanner;

public class MultiplesOf5 {

    public static void main(String []args) {

        // a program to print multiples of 5 between
        // the range specified by user

        // input line
        Scanner inputLine = new Scanner(System.in);

        // prompt the user for starting point
        System.out.print("Enter the start number: ");
        int startNumber = inputLine.nextInt();

        // prompt the user for ending point
        System.out.print("Enter the end number: ");
        int endNumber = inputLine.nextInt();

        // start point
        //int counter = 1;
        int counter = startNumber;

        // check point
//        while ( counter <= 250 ) {
        while ( counter <= endNumber ) {

            // check if the current counter is a multiple of 5
            if( counter%5 == 0 ){
                System.out.println(counter);
            }

            // change point
            counter++;   // ++counter
        }

    }

}
