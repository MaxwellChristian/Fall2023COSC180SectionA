
/*
Compute and display
the circumference of a circle
whose radius is as per user choice
*/

import java.util.Scanner;

public class CircleCircumference {

    // starting point
    public static void main(String []args) {

        // declaration section

        // syntax to define variable: datatype variable_name
        int radius;

        // input section
        radius = 2;

        // defining the input line from where the input will come
        Scanner inputLine = new Scanner(System.in);

        // capturing the input from user

        // prompting the user to enter an int value
        System.out.print("Enter an integer radius: ");

        // storing the user input
        radius = inputLine.nextInt();

        // assume the user has entered radius as 2

        // processing section
        // formula for circumference of a circle is 2*PI*RADIUS

        // output section
        System.out.print("Circumference of the circle with radius " + radius + " is " + (2 * 3.14 * radius));

    }

}
