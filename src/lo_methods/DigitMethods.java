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

        count = (Math.abs(number) + "").length();
        System.out.println("Count of digits in " + number + " : " + count );

        int sum = sumOfDigits(number);
        System.out.println("Sum of digits in " + number + " : " + sum );

        int reversed = reverseDigits(number);
        System.out.println("Sum of digits in " + number + " : " + reversed );

        String reversedStr = new StringBuilder(""+number).reverse().toString();
        System.out.println("Sum of digits in " + number + " : " + reversedStr );



    }

    private static int reverseDigits(int number) {
        int reversed = 0;

        for( reversed = 0; number != 0 ; number/=10 ){
            int dig = number % 10 ;

            reversed *= 10;
            reversed += dig;
        }

        return reversed;
    }

    private static int sumOfDigits(int number) {

        int sum;
        for( sum = 0; number != 0 ; number/=10 ){
            int dig = number % 10 ;
            sum += dig;
        }

        return sum;
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

        int counter = 0;

        if( number == 0 ){
            return 1;
        }
        else {
            for( counter = 0; number != 0 ; number/=10, counter++ );
        }




        // {
            // any logic here will be executed after the loop completes
            // as it is not a part of loop because
            // the loop has a semi-colon at the end
        // }

        return counter;
    }

}
