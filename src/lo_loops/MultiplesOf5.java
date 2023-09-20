package lo_loops;

public class MultiplesOf5 {

    public static void main(String []args) {

        // a program to print multiples of 5 between
        // the range specified by user

        // start point
        int counter = 1;

        // check point
        while ( counter <= 250 ) {

            // check if the current counter is a multiple of 5
            if( counter%5 == 0 ){
                System.out.println(counter);
            }

            // change point
            counter++;   // ++counter
        }

    }

}
