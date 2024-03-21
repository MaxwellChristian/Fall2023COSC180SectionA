package lo_loops;

public class DemoOfWhile {

    public static void main(String []args) {

        int counter;

        // start point
        counter = 1;
        // should be before the loop starts

        // check point
        // will be executed every time the loop runs
        // while : is an entry-controlled loop
        // i.e., it will check the condition to enter the loop

        System.out.println("Before the loop");
        // this will be executed only once before the loop starts

        while ( counter <= 5 ) {

            System.out.print(counter);
            System.out.print(" : ");
            System.out.println( counter * counter );

            // change point
            // the most important thing
            // should be present inside the loop
            counter = counter + 1;
        }

        System.out.print("After the loop");
        // this will be executed only once after the loop ends

    }

}
