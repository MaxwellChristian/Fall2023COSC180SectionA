package exception_handling;

import java.util.Scanner;

public class InputMismatchException {

    public static void main(String []args) {

        int num1;
        int num2;

        Scanner inputLine = new Scanner(System.in);
        boolean validInput = true;
        int counter = 0;

        do {

            try {
                System.out.print("Enter num1: ");
                num1 = inputLine.nextInt();

                System.out.print("Enter num2: ");
                num2 = inputLine.nextInt();

                System.out.printf("%d + %d : %d\n", num1, num2, (num1+num2));
                validInput = true;

            } catch (Exception ex) {
                validInput = false;
                inputLine.next();
                counter++;
            }

        } while (!validInput && counter < 2 );

    }

}
