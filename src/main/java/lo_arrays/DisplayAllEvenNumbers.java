package lo_arrays;

// Write a program where user enter a number and a choice to continue.
// Continue the program till the user enters 1 for 'Y'.
// Once the user enters 0 for 'N' as choice, display
// all the even numbers entered by user so far

// Keep a track that user should not enter more than 20 numbers

import java.util.Scanner;

public class DisplayAllEvenNumbers {

    public static void main(String []args){

        int number;
        int choice;
        int []evenNumbers = new int[20];
        int evenCounter = 0 ;

        Scanner inputLine = new Scanner(System.in);

        do {

            System.out.print("Enter a number: ");
            number = inputLine.nextInt();

            if( number%2 == 0 ){
                evenNumbers[evenCounter] = number;
                evenCounter++;
//                System.out.println(number + " : Even");
            }

            System.out.print("Continue [y:1 / n:0]: ");
            choice = inputLine.nextInt();

        } while ( choice == 1 );

        System.out.println("Even number: ");
        for( int counter = 0 ; counter < evenCounter ; counter++ ){
            System.out.println( evenNumbers[counter] );
        }

    }

}
