package lo_sorting;

import java.util.Arrays;

public class SearchDemo {

    public static void main(String[] args) {

        // the value to search is the first value in command line arguments
        int valueToSearch = Integer.parseInt(args[0]);

        // all remaining arguments are the list of values
        int[] iValues = convert(args, 1, args.length);

        // search for the value from the list
//        int foundAtPos = linearSearch(iValues, valueToSearch);

        Arrays.sort(iValues);
        System.out.println(Arrays.toString(iValues));
//        int foundAtPos = binarySearch(iValues, valueToSearch);
        int foundAtPos = binarySearchR(valueToSearch, iValues, 0, iValues.length);

        System.out.println(Arrays.toString(iValues));
        System.out.printf("%s\n", (foundAtPos != -1) ? args[0] + " found at " + foundAtPos : "Value does not exist");

    }

    private static int binarySearchR(int valueToSearch, int[] iValues, int left, int right) {

        // base case
        if( right >= left ){

            int mid = left + (right - left) / 2;

            if( iValues[mid] == valueToSearch ){
                return mid;
            }

            if( valueToSearch < iValues[mid] ){
                return binarySearchR(valueToSearch, iValues, left, mid-1);
            } else {
                return binarySearchR(valueToSearch, iValues, mid+1, right);
            }

        }

        return -1;
    }

    private static int binarySearch(int[] values, int valueToSearch) {

        int left = 0;
        int right = values.length - 1;

        while (left <= right) {

            int mid = left + ( right - left) / 2;

            // check if search value is available at mid-index
            if( values[mid] == valueToSearch ){
                return mid;
            }

            //
            if( values[mid] < valueToSearch ){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    private static int linearSearch(int[] iValues, int valueToSearch) {

        int index = 0;
        for (int value : iValues) {
            if (value == valueToSearch) {
                return index;
            }
            index++;
        }

        return -1;
    }

    private static int[] convert(String[] args, int startIndex, int endIndex) {
        int[] arr = new int[endIndex - startIndex];

        int destIndex = 0;
        for (int sourceIndex = startIndex; sourceIndex < endIndex; sourceIndex++) {
            arr[destIndex++] = Integer.parseInt(args[sourceIndex]);
        }

        return arr;
    }

}
