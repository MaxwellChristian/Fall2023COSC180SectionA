package lo_elementary_programming;
/*
Compute and display
the circumference of a circle
whose radius is as per user choice
*/


// This program demonstrates the use of int, float and double datatype

import java.util.Scanner;

public class CircleCircumference2 {

    // starting point
    public static void main(String []args) {

        // declaration section

        // syntax to define variable: datatype variable_name
        // datatype used: double -> it can hold numbers with decimals/precision [both negative and positive]
        // variable name: radius

        // the datatype 'double' is the default data type for decimals in JAVA

        double dRadius;
        dRadius = 2.7;

        // we can also use float to store values with decimals
        float fRadius;

        // fRadius = 2.8; // this will not work as the RHS is double while the LHS is float
        fRadius = 2.7F;

        // input section
        int radius;
        radius = 2;

        double dCircumference;
        float fCircumference;

        // when using constant values, try to have a final variable [suggested]
        // variable name for final is suggested to be all capital
        final double PI = 3.14;
        // pi = 3.1428; // not permitted, as the variable is final


        fCircumference = 2 * 3.14F * fRadius;
        dCircumference = 2 * 3.14 * dRadius;

        fCircumference = 2 * 3.14F * fRadius;
        dCircumference = 2 * PI * dRadius;

        // alternate approach : using in-built constant for PI
        dCircumference = 2 * Math.PI * dRadius;

        // defining the input line from where the input will come
        Scanner inputLine = new Scanner(System.in);
        // System.in -> the source from where the input is expected to come
        // Scanner -> which captures the input from the source

        // capturing the input from user

        // prompting the user to enter an int value
        System.out.print("Enter an integer radius: ");

        // storing the user input
        radius = inputLine.nextInt();
        // we are using nextInt as the variable to store is of type int

        // assume the user has entered radius as 2

        // processing section
        // formula for circumference of a circle is 2*PI*RADIUS

        // output section
        System.out.println("Circumference of the circle with radius (int) " + radius + " is " + (2 * 3.14 * radius));
        System.out.println("Circumference of the circle with radius (float) " + fRadius + " is " + fCircumference);

        System.out.println("Circumference of the circle with radius (double) " + dRadius + " is " + dCircumference);

        // displaying the same with formatted version
        // i.e., output in 4 decimals only

        System.out.printf("Value of PI in 2 decimals: %.2f", Math.PI);

    }

}
