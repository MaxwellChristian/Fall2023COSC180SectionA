package lo_elementary_programming;
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
        // datatype used: int -> it can hold only whole numbers [both negative and positive]
        // variable name: radius

        double radius;

        // input section
        radius = 2;

        // defining the input line from where the input will come
        Scanner inputLine = new Scanner(System.in);
        // System.in -> the source from where the input is expected to come
        // Scanner -> which captures the input from the source

        // capturing the input from user

        // prompting the user to enter an int value
        System.out.print("Enter an radius: ");

        // storing the user input
        radius = inputLine.nextDouble();
        // we are using nextInt as the variable to store is of type int

        // assume the user has entered radius as 2

        // processing section
        // formula for circumference of a circle is 2*PI*RADIUS

        // output section
        System.out.print("Circumference of the circle with radius " + radius + " is " + (2 * 3.14 * radius));

    }

}
