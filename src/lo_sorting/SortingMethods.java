package lo_sorting;

public class SortingMethods {

    public static void bubbleSortR(int[] iValues, int length) {
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

    public static void bubbleSort(int[] iValues) {
        for (int i = 0; i < iValues.length; i++) {
            for (int j = 0; j < iValues.length - i - 1; j++) {
                if (iValues[j] > iValues[j + 1]) {
                    swap(iValues, j, j + 1);
                }
            }
        }
    }

    public static void selectionSort(int[] values) {

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

    public static void selectionR(int[] iValues, int length, int startIndex) {
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

    public static int minIndex(int[] iValues, int startIndex, int endIndex) {
        if (startIndex == endIndex)
            return startIndex;

        // Find minimum of remaining elements
        int indexOfMin = minIndex(iValues, startIndex + 1, endIndex);

        // Return minimum of current and remaining.
        return (iValues[startIndex] < iValues[indexOfMin]) ? startIndex : indexOfMin;
    }

    public static void swap(int[] iValues, int index1, int index2) {
        iValues[index1] = iValues[index1] + iValues[index2];
        iValues[index2] = iValues[index1] - iValues[index2];
        iValues[index1] = iValues[index1] - iValues[index2];
    }

    public static int[] convert(String[] args) {
        int[] arr = new int[args.length];

        int index = 0;
        for (String token : args) {
            arr[index++] = Integer.parseInt(token);
        }

        return arr;
    }

    public static void insertionSort(int[] values) {

        int currentIndex;
        int shiftingIndex;

        for (currentIndex = 1; currentIndex < values.length; currentIndex++) {

            int currentValue = values[currentIndex];

            for (shiftingIndex = currentIndex - 1; shiftingIndex >= 0 && values[shiftingIndex] > currentValue; shiftingIndex--) {
                values[shiftingIndex + 1] = values[shiftingIndex];
            }

            values[shiftingIndex + 1] = currentValue;
        }

    }

    public static void insertionSortR(int[] values, int length) {

        // base case
        if (length <= 1) {
            return;
        }

        // sort first n-1 values
        insertionSortR(values, length - 1);

        // insert last element in the current position in sorted array
        int lastValue = values[length - 1];

        // shift the values[0 .. length-1], which are larger than last value,
        // to one index ahead of their current position
        int shiftingIndex;
        for (shiftingIndex = length - 2; shiftingIndex >= 0 && values[shiftingIndex] > lastValue; shiftingIndex--) {
            values[shiftingIndex + 1] = values[shiftingIndex];
        }

        values[shiftingIndex + 1] = lastValue;

    }

    public static void mergeSort(int[] values) {

        // base case
        if (values.length > 1) {

            // merge sort the left half of the list
            int[] leftList = new int[values.length / 2];
            System.arraycopy(values, 0, leftList, 0, values.length / 2);
            mergeSort(leftList);

            // merge sort the second half of the list
            int[] rightList = new int[values.length - values.length / 2];
            System.arraycopy(values, values.length / 2, rightList, 0, (values.length - values.length / 2));
            mergeSort(rightList);

            // merge first and second halves into a single list
            merge(leftList, rightList, values);
        }

    }

    private static void merge(int[] leftList, int[] rightList, int[] finalList) {

        int currentLeft = 0;
        int currentRight = 0;
        int currentFinal = 0;

        while (currentLeft < leftList.length && currentRight < rightList.length) {

            if (leftList[currentLeft] < rightList[currentRight]) {
                finalList[currentFinal++] = leftList[currentLeft++];
            } else {
                finalList[currentFinal++] = rightList[currentRight++];
            }

        }

        // copy the remaining values from left list
        while (currentLeft < leftList.length) {
            finalList[currentFinal++] = leftList[currentLeft++];
        }

        // copy the remaining values from the right list
        while (currentRight < rightList.length) {
            finalList[currentFinal++] = rightList[currentRight++];
        }
    }
}
