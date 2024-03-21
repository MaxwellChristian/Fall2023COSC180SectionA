package lo_loops;

public class DemoOfFor {

    public static void main(String []args) {

        int counter;

        // Syntax of for loop
        /*
        for( start point ; check condition ; change point ){

        }
        */


        System.out.println("Before the loop");
        // this will be executed only once before the loop starts

        for ( counter = 1 ; counter <= 50 ; counter+=1 ) {

            System.out.printf("%3d", counter);
            System.out.print(" : ");
            System.out.printf( "%5d\n", counter * counter );

        }

        System.out.print("After the loop");
        // this will be executed only once after the loop ends

    }

}
