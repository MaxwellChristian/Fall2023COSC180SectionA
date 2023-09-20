package lo_loops;

public class KgToPounds {

    public static void main(String []args) {

        int counter ;

        // start value
        counter = 1;

        // check condition
        while ( counter <= 199 ) {

            System.out.printf("%3d : %5.1f\n", counter, counter*2.2);

            // change value
            counter += 2;
        }

    }

}
