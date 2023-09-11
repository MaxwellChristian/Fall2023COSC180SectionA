package lo_decision_statements;

// Write a program which takes input of two numbers from user and
// displays the following

// both numbers are same -> when the numbers are same
// <num> is larger -> for the larger number

import java.util.Scanner;

public class LargerOfTwoNumbers {

    public static void main(String []args){

        // declaration
        int num1;
        int num2 ;

        // input

        // scanner line
        Scanner inputLine = new Scanner(System.in);

        // prompt the user
        System.out.print("Enter number 1: ");
        num1 = inputLine.nextInt();

        // prompt the user
        System.out.print("Enter number 2: ");
        num2 = inputLine.nextInt();

        // check for larger
        if( num1 > num2 ){
            System.out.println(num1 + " is larger");
        }
        else {

            if( num2 > num1 ){
                System.out.println(num2 + " is larger");
            }
            else {
                System.out.println("Both numbers are equal");
            }

        }

        // alternate approach
        if( num1 != num2 ){
            if( num1 > num2 ){
                System.out.println(num1 + " is larger");
            }
            else {
                System.out.println(num2 + " is larger");
            }
        }
        else {
            System.out.println("Both numbers are equal");
        }

    }

}
















