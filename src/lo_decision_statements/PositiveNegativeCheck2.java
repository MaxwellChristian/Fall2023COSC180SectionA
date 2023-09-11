package lo_decision_statements;

// Write a program which takes input of any number from user and
// checks if the number is positive or negative

// the output must be of following format

// for input of number 2, output must be
// 2: is positive.

// for input of number -78, output must be
// -78: is negative.

import java.util.Scanner;

public class PositiveNegativeCheck2 {

    public static void main(String []args){

        // declaration section
        int number;

        // input section
        // prompt the user
        System.out.print("Enter a number: ");

        // create the input line
        Scanner inputLine = new Scanner(System.in);

        // capture the input
        number = inputLine.nextInt();

        // check for exact ZERO
        if( number == 0 ){
            System.out.println(number + ": neutral number");
        }
        else {

            // check for positive or negative
            if ( number > 0 ) {
                // true part : executed only when the condition is true
                System.out.println( number + ": is positive.");
            }
            else {
                // false part : executed only when the condition is false.
                // false part is an optional part.
                System.out.println( number + ": is negative.");
                System.out.println("Negative numbers are less than ZERO");
            }

        }

        System.out.println("Bye");

    }

}
