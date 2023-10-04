package lo_methods;

import java.util.Scanner;

/*
* Write a program which takes input of a number and displays
* - count of the digits in the number
* */
public class DigitMethods {

    public static void main(String []args) {

        int number;

        Scanner inputLine = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = inputLine.nextInt();

        int count = countOfDigits(number);
        System.out.println("Count of digits in " + number + " : " + count );

    }

    private static int countOfDigits(int number) {

//        int counter = 0;
//        while (number > 0 ){
//            number /= 10;
//            counter++;
//        }

//        int counter;
//        for( counter = 0; number > 0 ; number/=10, counter++ ){
//
//        }

        int counter;
        for( counter = 0; number > 0 ; number/=10, counter++ );


        // {
            // any logic here will be executed after the loop completes
            // as it is not a part of loop because
            // the loop has a semi-colon at the end
        // }

        return counter;
    }

}
