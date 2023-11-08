package lo_oop;


/*
(The Location class) Design a class named Location for locating a maximal
value and its location in a two-dimensional array. The class contains public data
fields row, column, and maxValue that store the maximal value and its indices in
a two-dimensional array with row and column as int types and maxValue as a
double type.
Write the following method that returns the location of the largest element in a
two-dimensional array:
public static Location locateLargest(double[][] a)
The return value is an instance of Location. Write a test program that prompts
the user to enter a two-dimensional array and displays the location of the largest
element in the array.
 */

import java.util.Calendar;
import java.util.Scanner;

public class LocationTest {

    public static void main(String []args) {

        int rows;
        int cols;

        Scanner inputLine = new Scanner(System.in);

        System.out.print("Enter rows: ");
        rows = inputLine.nextInt();

        System.out.print("Enter cols: ");
        cols = inputLine.nextInt();

        double [][]values = new double[rows][cols];

        for( int r = 0 ; r < rows ; r++ ){
            for( int c = 0 ; c < cols ; c++ ) {
                System.out.printf("Enter values[%d][%d]: ", r, c);
                values[r][c] = inputLine.nextDouble();
            }
        }

        Location lObj = Location.locateLargest(values);
        System.out.println(lObj);



    }

}
