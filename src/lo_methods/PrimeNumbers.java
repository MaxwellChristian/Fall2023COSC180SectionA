package lo_methods;

/*
* Write a program which takes input of two numbers and displays
* all the numbers that are prime numbers
*
* Prime numbers are numbers which are divisible ONLY by 1 and itself
* i.e. does not have any factors
*
* perform the check for prime using a method
*
* Note: the program should check and work even if
* start number is less than end number
* */

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String []args){

        int startNumber;
        int endNumber;

        Scanner inputLine = new Scanner(System.in);

        System.out.print("Enter start number: ");
        startNumber = inputLine.nextInt();

        System.out.print("Enter end number: ");
        endNumber = inputLine.nextInt();

//        if( startNumber > endNumber ){
//            // swap the values
//            int temp = startNumber;
//            startNumber = endNumber;
//            endNumber = temp;
//        }

        startNumber = Math.min(startNumber, endNumber);
        endNumber = Math.max(startNumber, endNumber);

        for( int counter = startNumber ; counter <= endNumber ; counter++ ){

            // check if the counter is prime
            // boolean result = isPrime(counter);

            // if(result){
                // System.out.println(counter + " is prime");
            // }

            if(isPrime(counter)){
                System.out.println(counter + " is prime");
            }

        }

    }

    private static boolean isPrime(int value) {

        for(int divisor = 2 ; divisor < value ; divisor++){
            if( value%divisor == 0 ){
                return  false;
            }
        }

        return true;
    }

}
