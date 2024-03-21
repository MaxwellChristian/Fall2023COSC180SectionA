package lo_arrays.arrays_2d;

public class AttendanceDemo2 {

    public static void main(String []args) {

        int [][]attendanceValues = {
                {1, 1, 0, 0, 1},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 1}
        };

        int studentCounter;
        int dayCounter;

        int []studentAttendance = new int[3];
        int []dayAttendance = new int[5];

        for(studentCounter = 0 ; studentCounter < attendanceValues.length ; studentCounter ++){

            for( dayCounter = 0 ; dayCounter < attendanceValues[studentCounter].length; dayCounter++ ){
                System.out.print(attendanceValues[studentCounter][dayCounter] + " ");

                if( attendanceValues[studentCounter][dayCounter] == 1 ){
                    studentAttendance[studentCounter]++;
                    dayAttendance[dayCounter]++;
                }

            }

            System.out.print(" : " + studentAttendance[studentCounter]);

            System.out.println();
        }

        for (dayCounter= 0  ; dayCounter < dayAttendance.length ; dayCounter++){
            System.out.print(dayAttendance[dayCounter] + " ");
        }

    }

}
