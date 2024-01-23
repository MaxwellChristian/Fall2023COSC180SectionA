package lo_sorting;

import java.util.Arrays;

public class BubbleSortDemo {

    public static void main(String[] args) {

        int[] iValues = convert(args);

        // bubbleSort(iValues); // the iterative method

        bubbleSortR(iValues, iValues.length);   // the recursive method

        System.out.println(Arrays.toString(iValues));

    }

    private static void bubbleSortR(int[] iValues, int length) {
        if (length == 1) {
            return;
        }

        int count = 0;
        // One pass of bubble sort. After
        // this pass, the largest element
        // is moved (or bubbled) to end.
        for (int i = 0; i < iValues.length - 1; i++)
            if (iValues[i] > iValues[i + 1]) {
                // swap arr[i], arr[i+1]
                swap(iValues, i, i + 1);

                count = count + 1;
            }

        // Check if any recursion happens or not
        // If any recursion is not happen then return
        if (count == 0)
            return;

        // Largest element is fixed,
        // recur for remaining array
        bubbleSortR(iValues, iValues.length - 1);
    }

    private static void bubbleSort(int[] iValues) {
        for (int i = 0; i < iValues.length; i++) {
            for (int j = 0; j < iValues.length - i - 1; j++) {
                if (iValues[j] > iValues[j + 1]) {
                    swap(iValues, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] iValues, int index1, int index2) {
        iValues[index1] = iValues[index1] + iValues[index2];
        iValues[index2] = iValues[index1] - iValues[index2];
        iValues[index1] = iValues[index1] - iValues[index2];
    }

    private static int[] convert(String[] args) {
        int[] arr = new int[args.length];

        int index = 0;
        for (String token : args) {
            arr[index++] = Integer.parseInt(token);
        }

        return arr;
    }

}
