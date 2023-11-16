package doubt_solving_session_1;

import java.util.Arrays;
import java.util.Scanner;

public class Demo_Arrays_Methods_3 {

    public static void main(String[] args) {

        Scanner inputLine = new Scanner(System.in);

        int[] arrValues = new int[5];

        // loop for input
        for (int counter = 0; counter < arrValues.length; counter++) {
            System.out.print("Enter a number: ");
            arrValues[counter] = inputLine.nextInt();
        }

        System.out.println(Arrays.toString(arrValues));

        int []allPrimes = MyDemoMethods.filterAllPrimes( arrValues );
        System.out.println("Filtered prime values: " + Arrays.toString(allPrimes));
    }
}
