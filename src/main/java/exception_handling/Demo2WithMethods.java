package exception_handling;


/*
 * Write a program which can take size of an array from the user and
 *   1. creates an array of the specified size
 *   2. initialize all the elements of the array to random numbers upto 5
 *   3. divide the first number by second and so on
 *   4. display the result
 *
 *   All the steps 1, 2 and 3 should be done using methods
 * */

import java.util.Random;
import java.util.Scanner;

public class Demo2WithMethods {

    public static void main(String[] args) {

        Scanner inputLine = new Scanner(System.in);

        try {
            // input the array size
            System.out.print("Enter array size: ");
            int arrSize = inputLine.nextInt();

            // create the array as per size
            int[] arr = createArray(arrSize);
            System.out.println("Array creation completed");

            // initialize the array elements to random numbers upto 5
            initializeArray(arr, 5);
            System.out.println("Array initialization completed");

            // divide the value at an index by the value at next index
            showDivisionResult(arr);
            System.out.println("Arithmetic operations completed");


        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Bye");
        }

    }

    private static void showDivisionResult(int []arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            try {
                int result = arr[i] / arr[i + 1];

                // display the result
                System.out.printf("%d / %d : %d\n", arr[i], arr[i + 1], result);
            } catch ( ArithmeticException ex ) {
                System.out.println("Trying to divide by zero: Skipped");
            }

        }
    }

    private static void initializeArray(int[] arr, int maxValue) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(maxValue);
        }
    }

    private static int[] createArray(int arrSize) {
        try {
            return new int[arrSize];
        } catch (NegativeArraySizeException ex) {
            System.out.println("Array size cannot be negative");
            throw ex;
        }

    }

}
