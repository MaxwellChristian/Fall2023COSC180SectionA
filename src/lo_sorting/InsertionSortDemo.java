package lo_sorting;

import java.util.Arrays;

public class InsertionSortDemo {

    public static void main(String []args) {

        int []values = SortingMethods.convert(args);

        System.out.println("Unsorted : " + Arrays.toString(values));

        // SortingMethods.insertionSort(values);
        SortingMethods.insertionSortR(values, values.length);

        System.out.println("Sorted   : " + Arrays.toString(values));

    }

}
