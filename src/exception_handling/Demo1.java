package exception_handling;


import java.util.Scanner;

/*
* Write a program to input two numbers from user and
* display the result of dividing the first number by second
* */
public class Demo1 {

    public static void main(String []args) {

        int num1;
        int num2;

        Scanner inputLine = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        num1 = inputLine.nextInt();

        System.out.print("Enter number 2: ");
        num2 = inputLine.nextInt();

        try {
            int ans = num1 / num2;

            System.out.println("Result: " + ans);
        }
        catch ( ArithmeticException ex ){
            System.out.println("Number 2 cannot be ZERO");
        }

        System.out.println("Bye");

    }

}
