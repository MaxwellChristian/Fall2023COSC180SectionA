package lo_recursion;

/*
 * Write a recursive method which performs the following:
 *
 * m(n) = 1 + 1/2 + 1/3 + 1/4 + 1/5 + ... + 1/n
 * */

public class Series1 {

    public static void main(String[] args) {
        System.out.println("Sum: 1 to " + args[0] + " : " + summation(Integer.parseInt(args[0])));
        System.out.printf("Sum: 1 to %s : %.2f\n", args[0], summation2(Integer.parseInt(args[0])));
    }

    private static double summation2(int num) {
        return (num == 1) ? 1 : ((1.0 / num) + summation2(num - 1));
    }

    private static int summation(int num) {
        return (num == 1) ? 1 : (num + summation(num - 1));
    }

}
