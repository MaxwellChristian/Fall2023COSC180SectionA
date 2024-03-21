package exception_handling;

import java.util.Random;

public class DemoMethods {

    public static void showDivisionResult(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            try {
                int result = arr[i] / arr[i + 1];

                // display the result
                System.out.printf("%d / %d : %d\n", arr[i], arr[i + 1], result);
            } catch (ArithmeticException ex) {
                System.out.println("Trying to divide by zero: Skipped");
            }

        }
    }

    public static void initializeArray(int[] arr, int maxValue) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(maxValue);
        }
    }

    public static int[] createArray(int arrSize) throws Exception {
        if( arrSize > 0 ){
            return new int[arrSize];
        }
        else {
            //throw new Exception("Array size must be positive");
            throw new MyException("Please provide the array size as positive");
        }

    }

}
