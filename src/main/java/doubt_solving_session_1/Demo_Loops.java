package doubt_solving_session_1;

public class Demo_Loops {

    public static void main(String []args) {

//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//        System.out.println("4");
//        System.out.println("5");
//        System.out.println("6");
//        System.out.println("7");
//        System.out.println("8");
//        System.out.println("9");
//        System.out.println("10");

        // we are starting from 1 and moving forward to 10.
        // Each time incrementing by 1

        // using a loop

        // the for loop: just requires TWO semicolons
        // that makes THREE parts of the loop


        // we are starting from 1 and moving forward to 10.
        // Each time incrementing by 1
        // STEP 1: START point i.e. 1
        // STEP 2: END point i.e. 10
        // STEP 3: CHANGE point i.e. INCREMENT by 1

        // for( START ; CONDITION ; CHANGE )

        int counter;
//        for( counter = 1 ; counter <= 10 ; counter++ ){
//            System.out.println(counter);
//        }

        // writing the same using a while loop

        // while ( condition )

        counter = 1;    // START point
        while( counter <= 10 ){
            System.out.println(counter);

            counter++;  // CHANGE point
        }

        // print all the numbers from 47 to 109 which are divisible by 5

        // complete using a while loop
        counter = 47;
        while (counter <= 109) {

            if( counter%5 == 0 ){
                System.out.println(counter);
            }

            counter++;
        }

    }

}
