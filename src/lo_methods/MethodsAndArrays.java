package lo_methods;

import java.util.Arrays;

public class MethodsAndArrays {

    public static void main(String[] args) {

        // call/invoke a method which returns an array filled with random numbers
        int[] values = generateRandomArray(20, 10);
        int[] binaryValues = generateRandomArray(20);

        System.out.println(Arrays.toString(values));
        System.out.println(Arrays.toString(binaryValues));

//        boolean has3 = arrContains(values, 3) > 0;
        System.out.println("3 exists in array : " + (indexInArray(values, 0, values.length, 3) != -1));

        // modify/add the function to count the total times 55 occurs in random generated array
        int count3 = arrContains(values, 3);
        System.out.println("3 occurs in array " + count3 + " times ");

        int positionFound = indexInArray(values, 0, values.length, 3);
        if (positionFound != -1) {
            System.out.println("3 found at : " + positionFound);
        } else {
            System.out.println("3 does not exist in the array");
        }

        // create a new array which holds values after the first occurence of 3
        int secondPosition = indexInArray(values, positionFound+1, values.length, 3);

        int lastPosition = lastIndexInArray(values, 3);

//        int valueToSearch = 3;
//        int foundAtPosition = ArrayUtilities.search(values, 0, values.length, valueToSearch);

    }

    private static int lastIndexInArray(int[] values, int valueToCheck) {
        for (int position = values.length-1 ; position >= 0 ; position--) {
            if (values[position] == valueToCheck) {
                return position;
            }
        }
        return -1;
    }

    private static int indexInArray(int[] values, int startPosition, int endPosition, int valueToCheck) {
        for (int position = startPosition ; position < endPosition ; position++) {
            if (values[position] == valueToCheck) {
                return position;
            }
            position++;
        }
        return -1;
    }

    private static int arrContains(int[] values, int valueToCheck) {

        int count = 0;
        for (int currentValue : values) {
            if (currentValue == valueToCheck) {
                count++;
            }
        }
        return count;
    }

    private static int[] generateRandomArray(int totalValues, int maxValuePermitted) {
        int[] arrToReturn = new int[totalValues];
        for (int index = 0; index < arrToReturn.length; index++) {
            arrToReturn[index] = (int) (Math.random() * maxValuePermitted);
        }

        return arrToReturn;
    }

    private static int[] generateRandomArray(int totalValuesRequired) {
        return generateRandomArray(totalValuesRequired, 2);
    }

    private static int[][] fetchRows(int[][] values) {

        // decide the total destination rows required
        int totalDestRows = (values.length%2==0) ? (values.length/2) : (values.length/2+1) ;

        // create a new 2D array to hold the values from each even row from source values
        int [][]evenRowValues = new int[totalDestRows][0];  // total computed rows and 0 cols

        int destRow = 0;    // the destination row counter

        for(int row = 0 ; row < values.length ; row++){

            // check if the source row is even
            if( row%2 == 0 ){

                // assign the values at even row to the destination row
                evenRowValues[destRow] = values[row];

                // increment the destination row
                destRow++;
            }

        }

        // return the result values
        return evenRowValues;
    }

    public static int[] convert(int[][] values2D) {

        // count total values in 2D
        int count = 0;
        for( int []sourceRow : values2D ){
            for(int currentValue: sourceRow){
                count++;
            }
        }

        int []final1DValues = new int[count];

        int index = 0;
        for( int []sourceRow : values2D ){
            // copy values from current row to 1D array
            for(int currentValue: sourceRow){
                final1DValues[index++] = currentValue;
            }
        }

        return final1DValues;
    }

    private static int[][] convert(int[] values1D, int maxCols) {

        // decide how many rows are required in destination 2D
        int totalRowsRequired = (values1D.length % maxCols == 0) ? (values1D.length / maxCols) : (values1D.length / maxCols + 1);

        // create a 2D array with desired rows and each row having maxCols
        int[][] values2D = new int[totalRowsRequired][maxCols];

        int sourceIndex = 0;  // index to fetch the value from 1D array

        // iterate on each row
        for (int row = 0; row < values2D.length; row++) {

            // fetch the values from the current row
            int[] tempRow = new int[maxCols];

            int totalValuesCopied;  // count of total values copied

            for (totalValuesCopied = 0; totalValuesCopied < maxCols && sourceIndex < values1D.length; totalValuesCopied++) {
                tempRow[totalValuesCopied] = values1D[sourceIndex++];
            }

            // assign the total values required to the destination row
            values2D[row] = Arrays.copyOf(tempRow, totalValuesCopied);
        }

        return values2D;
    }

}
