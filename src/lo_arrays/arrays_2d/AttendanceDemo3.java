package lo_arrays.arrays_2d;

import java.util.Arrays;

public class AttendanceDemo3 {

    public static void main(String[] args) {

        int[][] attendanceValues = {
                {1, 1, 0, 0, 1},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 1}
        };

        int studentCounter;
        int dayCounter;

        int[] studentAttendance = getRowWiseTotal(attendanceValues);
        System.out.println(Arrays.toString(studentAttendance));

        int[] dayAttendance = getColWiseTotal(attendanceValues);
        System.out.println(Arrays.toString(dayAttendance));

        // print the whole matrix/2D-array/table
        for (studentCounter = 0; studentCounter < attendanceValues.length; studentCounter++) {

            // this method displays all the values from a 1D-array
            showValues(attendanceValues[studentCounter]);

            // printing a new line
            System.out.println();
        }


    }

    private static int[] getColWiseTotal(int[][] values) {
        int []totals = new int[ values[0].length ];

        for( int rowCounter = 0 ; rowCounter < values.length ; rowCounter++ ){
            for( int colCounter = 0 ; colCounter < values[rowCounter].length ; colCounter++ ){
                totals[colCounter] += values[rowCounter][colCounter];
            }
        }

        return totals;
    }

    private static int[] getRowWiseTotal(int[][] values) {

        int []totals = new int[values.length];

        for( int rowCounter = 0 ; rowCounter < values.length ; rowCounter++ ){
            for( int colCounter = 0 ; colCounter < values[rowCounter].length ; colCounter++ ){
                totals[rowCounter] += values[rowCounter][colCounter];
            }
        }

        return totals;
    }

    private static void showValues(int[] values) {
        for (int currentValue : values) {
            System.out.print(currentValue + " ");
        }
    }

}
