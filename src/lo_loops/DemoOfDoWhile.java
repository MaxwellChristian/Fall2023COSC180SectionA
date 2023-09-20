package lo_loops;

// Write a program which takes a number as input from the user and
// checks if the number is positive or not.
// Then it asks the user if the user wants to continue,
// if yes, the program continues.

import java.util.Scanner;

public class DemoOfDoWhile {

    public static void main(String []args){

        int number;
        String choiceToContinue;

        // input line
        Scanner inputLine = new Scanner(System.in);

        do {
            // prompt the user
            System.out.print("Enter a number: ");
            number = inputLine.nextInt();

            // check for the number [positive/negative]
            if (number > 0) {
                System.out.println(number + " : positive");
            } else {
                if (number < 0) {
                    System.out.println(number + " : negative");
                } else {
                    System.out.println(number + " : ZERO");
                }
            }

            // ask the user choice to continue
            System.out.print("Continue [y/n]: ");
            choiceToContinue = inputLine.next();

            // check if choice is 'y', then continue
        } while ( choiceToContinue.charAt(0) == 'y' );

    }

}
