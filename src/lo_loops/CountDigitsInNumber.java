package lo_loops;

// Write a program which counts the number of digits in a given number

import java.util.Scanner;

public class CountDigitsInNumber {

    public static void main(String []args) {

        // variable to store the input number
        int number;

        // variable to store the count of all digits
        int countOfDigits;

        // variable to store the sum of all digits
        int sumOfDigits;

        // configure the input line
        Scanner input = new Scanner(System.in);

        // prompt the user to input the number
        System.out.print("Enter a number: ");
        number = input.nextInt();
        int numberForDisplay = number;

        // logic to count the digits from the input number
        // logic to count the sum digits from the input number

        countOfDigits = 0;
        sumOfDigits = 0 ;

        while (number > 0) {

            sumOfDigits += (number%10);

            countOfDigits++;
            number /= 10;
        }

        System.out.println("Total digits in " + numberForDisplay + " : " + countOfDigits);
        System.out.println("Sum of digits of " + numberForDisplay + " : " + sumOfDigits);

    }

}
