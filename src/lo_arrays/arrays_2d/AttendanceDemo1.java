package lo_arrays.arrays_2d;

public class AttendanceDemo1 {

    public static void main(String []args) {

        final int TOTAL_STUDENTS = 3;
        final int TOTAL_DAYS = 5;

        // int [][]attendance = new int[3][5];
        // capturing attendance
            // of 3 students
            // for 5 days
        // i.e., 3 rows and 5 columns

        // int [][]attendance = new int[TOTAL_STUDENTS][TOTAL_DAYS];

        int [][]attendance = {
                {1, 1, 0, 0, 1},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 1}
        };

        int row;
        int col;

        /*for(row = 0 ; row < TOTAL_STUDENTS ; row ++){
            for( col = 0 ; col < TOTAL_DAYS; col++ ){
                System.out.print(attendance[row][col] + " ");
            }
            System.out.println();
        }*/

        for(row = 0 ; row < attendance.length ; row ++){

            int rowTotal = 0;
            for( col = 0 ; col < attendance[row].length; col++ ){
                System.out.print(attendance[row][col] + " ");

                // increment the total if the student is present i.e, for value 1
                if( attendance[row][col] == 1 ){
                    rowTotal++;
                }
            }

            System.out.print(" : " + rowTotal);

            System.out.println();
        }

    }

}
