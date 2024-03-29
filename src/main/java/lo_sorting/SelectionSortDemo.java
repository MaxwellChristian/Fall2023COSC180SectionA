package lo_sorting;

import java.util.Arrays;

/*
* Create a recursive method for selection sort
* */

public class SelectionSortDemo {

    public static void main(String[] args) {

        int[] iValues = convert(args);

        selectionR(iValues, iValues.length, 0);
//        selectionSort(iValues);

        System.out.println(Arrays.toString(iValues));

    }

    private static void selectionSort(int[] values) {

        // iterate over each value
        for (int i = 0; i < values.length; i++) {

            // set the minimum value
            int minIndex = i;
            boolean swapRequired = false;

            // search the minimum value for remaining elements
            for (int j = i + 1; j < values.length; j++) {

                // compare if the current value is smaller than the min value
                if (values[j] < values[minIndex]) {
                    minIndex = j;
                    swapRequired = true;
                }
            }

            if (swapRequired) {
                // swap the value at minIndex and the found index
                swap(values, i, minIndex);
            }

        }

    }

    private static void selectionR(int[] iValues, int length, int startIndex) {
        // Return when starting and size are same
        if (startIndex == length)
            return;

        // calling minimum index function for minimum index
        int minIndex = minIndex(iValues, startIndex, length - 1);

        // Swapping when index and minimum index are not same
        if (minIndex != startIndex) {
            // swap
            swap(iValues, minIndex, startIndex);
        }

        // Recursively calling selection sort function
        selectionR(iValues, length, startIndex + 1);
    }

    private static int minIndex(int[] iValues, int startIndex, int endIndex) {
        if (startIndex == endIndex)
            return startIndex;

        // Find minimum of remaining elements
        int indexOfMin = minIndex(iValues, startIndex + 1, endIndex);

        // Return minimum of current and remaining.
        return (iValues[startIndex] < iValues[indexOfMin]) ? startIndex : indexOfMin;
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
