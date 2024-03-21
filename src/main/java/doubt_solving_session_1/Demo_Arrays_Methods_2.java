package doubt_solving_session_1;

import java.util.Arrays;
import java.util.Scanner;

public class Demo_Arrays_Methods_2 {

    public static void main(String[] args) {

        Scanner inputLine = new Scanner(System.in);

        int[] arrValues = new int[5];

        // loop for input
        for (int counter = 0; counter < 5; counter++) {
            System.out.print("Enter a number: ");
            arrValues[counter] = inputLine.nextInt();
        }

        System.out.println(Arrays.toString(arrValues));

        int []allPrimes = filterAllPrimes( arrValues );
        System.out.println("Filtered prime values: " + Arrays.toString(allPrimes));
    }

    private static int[] filterAllPrimes(int[] arr) {

        // create an array to hold the filtered prime values
        int []filteredArray = new int[ arr.length ];

        int destIndex = 0;

        // check each value from the parameter array for prime
        for( int index = 0 ; index < arr.length ; index++ ){
            // check for that value to be prime
            if( checkForPrime(arr[index]) ){
                // if prime, copy that value to the filtered array
                filteredArray[ destIndex ] = arr[index];
                destIndex++;
            }
        }

        // once all values are checked, return the filtered array
        int[] arrToReturn = Arrays.copyOfRange(filteredArray, 0, destIndex);
        return arrToReturn;
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
