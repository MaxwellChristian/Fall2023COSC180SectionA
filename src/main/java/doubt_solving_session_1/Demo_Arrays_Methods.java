package doubt_solving_session_1;

import java.util.Scanner;

public class Demo_Arrays_Methods {

    public static void main(String[] args) {

        Scanner inputLine = new Scanner(System.in);

        int[] nA = new int[5];

        // take 5 inputs from the user
        // after all 5 inputs are done, show all EVEN numbers

        // loop for input
        for (int counter = 0; counter < 5; counter++) {
            System.out.print("Enter a number: ");
            // number = inputLine.nextInt();
            nA[counter] = inputLine.nextInt();
        }

        // print all prime numbers from the input values
        for (int pos = 0; pos < nA.length; pos++) {

            // check if the current number is a prime number
            // i.e. na[Pos] is to be checked for prime

            if (checkForPrime(nA[pos])) {
                System.out.println(nA[pos] + " : Prime");
            }

        }

        // print all numbers from the input values which are prime and
        // also larger than 20
        for (int pos = 0; pos < nA.length; pos++) {

            // check if it is a prime and larger than 20
            if (nA[pos] > 20 && checkForPrime(nA[pos])) {
                System.out.println(nA[pos] + " : Prime");
            }

        }

    }

    private static boolean checkForPrime(int value) {

        for (int divisor = 2; divisor < value; divisor++) {
            if (value % divisor == 0) {
                return false;
            }
        }

        return true;
    }

}
