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


import java.util.Scanner;

public class Demo3WithMethods {

    public static void main(String[] args) {

        Scanner inputLine = new Scanner(System.in);

        // input the array size
        System.out.print("Enter array size: ");
        int arrSize = inputLine.nextInt();

        // create the array as per size
        int[] arr = new int[0];
        try {
            arr = DemoMethods.createArray(arrSize);
            System.out.println("Array creation completed");

            // initialize the array elements to random numbers upto 5
            DemoMethods.initializeArray(arr, 5);
            System.out.println("Array initialization completed");

            // divide the value at an index by the value at next index
            DemoMethods.showDivisionResult(arr);
            System.out.println("Arithmetic operations completed");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Bye");
        }


    }

}
