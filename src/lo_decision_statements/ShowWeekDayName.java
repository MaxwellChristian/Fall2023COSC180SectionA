package lo_decision_statements;

import java.util.Scanner;

public class ShowWeekDayName {

    public static void main(String []args){

        // declaration
        int dayNumber;

        // input
        Scanner inputLine = new Scanner(System.in);

        System.out.print("Enter day number: ");
        dayNumber = inputLine.nextInt();

        // check and print the day name
//        if( dayNumber == 1 ){
//            System.out.println("Sunday");
//        }
//        else {
//            if ( dayNumber == 2 ){
//                System.out.println("Monday");
//            }
//        }

        // alternate approach
        switch ( dayNumber ){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
                // break;
                // when as case is matched and there is no break,
                // the next case will be executed without a check
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Day number must be between 1 and 7 [inclusive]");
                // default case is executed when no other previous case was matched
                // usually should be at last
                // if at last, the break statement can be omitted
        }

        System.out.println("Completed the check for day number");


    }

}
