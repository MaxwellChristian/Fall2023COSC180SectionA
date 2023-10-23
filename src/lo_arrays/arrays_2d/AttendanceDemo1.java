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

        int studentCounter;
        int dayCounter;

        /*for(studentCounter = 0 ; studentCounter < TOTAL_STUDENTS ; studentCounter ++){
            for( dayCounter = 0 ; dayCounter < TOTAL_DAYS; dayCounter++ ){
                System.out.print(attendance[studentCounter][dayCounter] + " ");
            }
            System.out.println();
        }*/

        for(studentCounter = 0 ; studentCounter < attendance.length ; studentCounter ++){

            int rowTotal = 0;
            for( dayCounter = 0 ; dayCounter < attendance[studentCounter].length; dayCounter++ ){
                System.out.print(attendance[studentCounter][dayCounter] + " ");

                // increment the total if the student is present i.e, for value 1
                if( attendance[studentCounter][dayCounter] == 1 ){
                    rowTotal++;
                }
            }

            System.out.print(" : " + rowTotal);

            System.out.println();
        }


        // calculating day-wise totals
        // i.e., column-total

        for (dayCounter = 0 ; dayCounter < TOTAL_DAYS ; dayCounter++ ){

            int colTotal = 0 ;
            for( studentCounter = 0 ; studentCounter < TOTAL_STUDENTS ; studentCounter++ ){

                if( 1 == attendance[studentCounter][dayCounter] ){
                    colTotal++;
                }

            }

            System.out.print(colTotal + " ");

        }

    }

}
