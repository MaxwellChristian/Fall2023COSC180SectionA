package doubt_solving_session_1;

public class Demo_methods {

    public static void main(String[] args) {

        int counter;

        // print all numbers from 11 to 21 [using for loop]
        // all the numbers printed should be separated by COMMA

//        for (counter = 11 ; counter < 21 ; counter++) {
//            System.out.print(counter + ", " );
//        }
//        System.out.print(counter);
        showRange(11, 21);
        System.out.println();

        // print all numbers from 101 to 211 [using for loop]
        // all the numbers printed should be separated by COMMA

//        for (counter = 101 ; counter < 211 ; counter++) {
//            System.out.print(counter + ", " );
//        }
//        System.out.print(counter);
        showRange(101, 211);
        System.out.println();

        // print all numbers from 311 to 351 [using for loop]
        // all the numbers printed should be separated by COMMA
//        for (counter = 311 ; counter < 351 ; counter++) {
//            System.out.print(counter + ", " );
//        }
//        System.out.print(counter);
        showRange(311, 351);
        System.out.println();

    }

    private static void showRange(int start, int end) {
        int counter;
        for (counter = start; counter < end; counter++) {
            System.out.print(counter + ", ");
        }
        System.out.print(counter);
    }

}
