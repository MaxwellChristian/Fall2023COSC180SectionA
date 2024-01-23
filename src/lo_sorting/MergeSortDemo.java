package lo_sorting;

import java.util.Arrays;

public class MergeSortDemo {

    public static void main(String []args) {

        int []values = SortingMethods.convert(args);

        System.out.println("Unsorted : " + Arrays.toString(values));

        mergeSort(values);

        System.out.println("Sorted   : " + Arrays.toString(values));

    }

    private static void mergeSort(int[] values) {

        // base case
        if (values.length > 1) {

            // merge sort the left half of the list
            int[] leftList = new int[values.length / 2];
            mergeSort(leftList);

            // merge sort the second half of the list
            int[] rightList = new int[values.length - values.length / 2];
            mergeSort(rightList);

            // merge first and second halves into a single list
            merge(leftList, rightList, values);
        }

    }

    private static void merge(int[] leftList, int[] rightList, int[] finalList) {


        // try to merge each value from both lists
            // compare the values and decide which value to copy to final list


        // copy the remaining values from left list


        // copy the remaining values from the right list

    }

}
