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

        int [][]values2D = new int[][]{
                {11, 12, 13,14},
                {15, 17, 18}
        };

        int totalValues = countValues(values2D);
        System.out.println("Total elements in 2D: " + totalValues);

    }

    private static int countValues(int[][] values2D) {

        int total = 0;
        for( int r = 0 ; r < values2D.length ; r++ ){
            for( int c = 0 ; c < values2D[r].length ; c++ ){

//                if( MyDemoMethods.checkForPrime( values2D[r][c] ) ){
//
//                }

                total++;
            }
        }

        return total;
    }
}
