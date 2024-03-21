package lo_sorting;

import java.util.Arrays;

public class MergeSortDemo {

    public static void main(String []args) {

        int []values = SortingMethods.convert(args);

        System.out.println("Unsorted : " + Arrays.toString(values));

        SortingMethods.mergeSort(values);

        System.out.println("Sorted   : " + Arrays.toString(values));

    }

}
