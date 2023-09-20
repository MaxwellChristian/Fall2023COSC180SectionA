package lo_loops;


/*
CST Tuition is allowed to increase at annual rate of 3.5%.
Given that tuition is 9610 – print out the tuition costs for the next 10 years.
 */
public class TuitionTrend {

    public static void main(String []args) {

        int year;
//        int counter;

        double tuition = 9610;
        final double tuitionIncreaseRate = 3.5;

        // for( year = 2023, counter = 0 ; counter <= 10 ; counter+=1 ){
        for( year = 2023 ; year <= 2033 ; /* year++ */ ){
//            System.out.printf("%4d : %.0f\n", year, tuition );
//            year++;

            System.out.printf("%4d : %.0f\n", year++, tuition );
//            year++;

            tuition = tuition + (tuition*(tuitionIncreaseRate/100));
        }

    }

}
