package lo_methods;

import java.util.Random;

/*
 * Write a program which generates 10 random integers.
 * The generated random number must be less than 15.
 *
 * Then show the factorial of each generated random number.
 *
 * The output should be formatted as below:
 * num1  :   factorial_of_num1
 * num2  :   factorial_of_num2
 * num3  :   factorial_of_num3
 *
 * */
public class DisplayFactorial {

    public static void main(String[] args) {

        // declare the variables
        int[] num = new int[10];
        int fact;

        // input/generate the values
        int counter;
        for (counter = 0; counter < num.length; counter++) {
            num[counter] = new Random().nextInt(7);
        }



        // perform the logic
        for (counter = 0; counter < num.length; counter++) {

            // display as required
            // output required is:
            // num  : factorial_of_num

            // logic of factorial
//            int temp = num[counter];
//            fact = 1;
//            while (temp > 1) {
//                fact *= temp;
//                temp--;
//            }

            // assume you have a ready function to
            // compute factorial

            fact = calculateFactorial(num[counter]);

            System.out.println(num[counter] + " : " + fact);

        }


    }

    private static int calculateFactorial(int value) {

        int computedFactorial = 1;
        while (value > 1) {
            computedFactorial *= value;
            value--;
        }

        return computedFactorial;
    }

}
