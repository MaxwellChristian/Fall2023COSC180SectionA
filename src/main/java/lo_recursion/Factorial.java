package lo_recursion;
/*
 * lo_recursion.Factorial
 * 5! = 5 * 4 * 3 * 2 * 1
 *
 * i.e., 5! = 5 * factorial(4)
 *
 * */

public class Factorial {

    public static void main(String[] args) {

        int num = 5;

        int fact = factorialR(num);

        System.out.println(fact);

    }

    private static int factorial(int num) {
        int fact = 1;

        while (num > 1) {
            fact = fact * num;
            num--;
        }

        return fact;
    }

    private static int factorialR(int num) {

        if( num == 1 ){
            return 1;
        } else {
            return num * factorialR(num-1);
        }
    }

}
