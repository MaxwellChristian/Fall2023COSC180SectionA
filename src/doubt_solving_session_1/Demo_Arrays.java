package doubt_solving_session_1;

import java.util.Scanner;

public class Demo_Arrays {

    public static void main(String[] args) {

        Scanner inputLine = new Scanner(System.in);

//        int number = 0;
//
//        int n1;
//        int n2;
//        int n3;
//        int n4;
//        int n5;

        int[] nA = new int[5];

//        System.out.print("Enter a number: " );
//        n1 = inputLine.nextInt();
//        nA[0] = inputLine.nextInt();
//
//        System.out.print("Enter a number: " );
//        n2 = inputLine.nextInt();
//        nA[1] = inputLine.nextInt();
//
//        System.out.print("Enter a number: " );
//        n3 = inputLine.nextInt();
//        nA[2] = inputLine.nextInt();
//
//        System.out.print("Enter a number: " );
//        n4 = inputLine.nextInt();
//        nA[3] = inputLine.nextInt();
//
//        System.out.print("Enter a number: " );
//        n5 = inputLine.nextInt();
//        nA[4] = inputLine.nextInt();


        // take 5 inputs from the user
        // after all 5 inputs are done, show all EVEN numbers

        // loop for input
        for (int counter = 0; counter < 5; counter++) {
            System.out.print("Enter a number: ");
            // number = inputLine.nextInt();
            nA[counter] = inputLine.nextInt();
        }

        // loop for check and print
//        for( int position = 0 ; position < 5 ; position++ ){
        for (int index = 0; index < nA.length; index++) {
//            if( number%2 == 0 ){
            if (nA[index] % 2 == 0) {
//                System.out.println(number + " : Even");
                System.out.println(nA[index] + " : Even");
            }
        }

    }

}
