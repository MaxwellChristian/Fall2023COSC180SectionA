package lo_arrays;

import java.util.Random;
import java.util.Scanner;

/*
 * Write a program which takes input of 2 numbers from user.
 * Both the numbers must  be different.
 * Create two different arrays as per the two input numbers.
 * Then the program generates random numbers and stores them
 * in the two arrays.
 * The program should then create a 3rd array and
 * store the values from array1 followed by array2 in array3
 *
 * Ex:
 * num1 : 5
 * num2 : 7
 * arr1 : 10, 78, 32, 45, 11
 * arr2 : 100, 78, 75, 11, 11, 78, 75
 * arr3 : 10, 78, 32, 45, 11, 100, 78, 75, 11, 11, 78, 75
 * */
public class CombineArrays2 {

    public static void main(String[] args) {

        int size1;  // size for array 1
        int size2;  // size for array 2

        int[] values1;  // array1 to hold first set of values
        int[] values2;  // array2 to hold second set of values

        int[] combinedValues;
        // array to hold both set of values

        // line to capture input from user
        Scanner inputLine = new Scanner(System.in);

        // prompt the user to input size for array 1
        System.out.print("Enter size 1 : ");
        // capture the size of array 1
        size1 = inputLine.nextInt();

        // prompt the user to input size for array 2
        System.out.print("Enter size 2 : ");
        // capture the size of array 1
        size2 = inputLine.nextInt();

        // create array 1 as per size 1
        values1 = new int[size1];

        // create array 2 as per size 2
        values2 = new int[size2];

        // create the combined set
        combinedValues = new int[size1 + size2];

        int index3 = 0;

        // input values in array 1
        for (int index1 = 0; index1 < values1.length; index1++) {
            combinedValues[index3++] = values1[index1] = new Random().nextInt(100);
        }

        // input values in array 2
        for (int index2 = 0; index2 < values2.length; index2++) {
            combinedValues[index3++] = values2[index2] = new Random().nextInt(100);
        }

        // logic to combine the array 2 after array 1
        // already completed when generating random numbers

        // display the array 1
        for (int currentValue : values1) {
            System.out.print(currentValue + " ");
        }
        System.out.println();

        // display the array 2
        for (int currentValue : values2) {
            System.out.print(currentValue + " ");
        }
        System.out.println();

        // display the combined array
        for (int currentValue : combinedValues) {
            System.out.print(currentValue + " ");
        }
        System.out.println();

    }


}
