package lo_recursion;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibo(Integer.parseInt(args[0])));
    }

    private static long fibo(int index) {

        if (index == 0) // Base case
            return 0;
        else if (index == 1) // Base case
            return 1;
        else // Reduction and recursive calls
        {
            // uncomment the below line to see the values that make the recursive calls
            // System.out.print(index + " ");
            return fibo(index - 1) + fibo(index - 2);
        }

    }

}
