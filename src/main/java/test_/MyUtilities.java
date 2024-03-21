package test_;

import java.util.Arrays;

public class MyUtilities {
    public static final int TYPE_EVEN = 0;
    public static final int TYPE_ODD = 1;
    public static final int TYPE_PRIME = 2;
    public static final int TYPE_ROW = 0;
    public static final int TYPE_COL = 1;
    public static final int BASE16 = 16;
    public static final int BASE2 = 2;
    public static final int BASE8 = 8;

    public static String convertBase(int number, int baseRequired) {

        String result = "";

        switch (baseRequired) {
            case BASE16:
                return Integer.toHexString(number);
            case BASE2:
                return Integer.toBinaryString(number);
            case BASE8:
                return Integer.toOctalString(number);

        }

        return result;
    }

    enum SORT{
        ASCENDING,
        DESCENDING
    }
    public static final int SORT_ASC = 0;
    public static final int SORT_DESC = 1;

    public static int[] generateValues(int totalValuesRequired, int maxValuePermitted) {

        int[] values = new int[totalValuesRequired];
        for (int i = 0; i < totalValuesRequired; i++) {
            values[i] = (int) (Math.random() * maxValuePermitted);
        }

        return values;
    }

    public static int computeTotal(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    private static void test() {

    }

    private static int[] filterEvenValues(int[] values) {

        int[] filteredValues = new int[values.length];
        int destPos = 0;

        for (int sourcePos = 0; sourcePos < values.length; sourcePos++) {
            if (values[sourcePos] % 2 == 0) {
                filteredValues[destPos] = values[sourcePos];
                destPos++;
            }
        }

        return Arrays.copyOfRange(filteredValues, 0, destPos);
    }

    private static int[] filterOddValues(int[] values) {
        int[] filteredValues = new int[values.length];
        int destPos = 0;

        for (int sourcePos = 0; sourcePos < values.length; sourcePos++) {
            if (values[sourcePos] % 2 != 0) {
                filteredValues[destPos] = values[sourcePos];
                destPos++;
            }
        }

        return Arrays.copyOfRange(filteredValues, 0, destPos);
    }

    public static int[] filterValues(int[] values, int valueType) {

        switch (valueType) {
            case TYPE_EVEN:
                return filterEvenValues(values);
            case TYPE_ODD:
                return filterOddValues(values);
        }

        return values;
    }

    public static int indexOf(int valueToSearch, int[] values, int startIndex, int endIndex) {

        for (int index = startIndex; index < endIndex; index++) {
            if (values[index] == valueToSearch) {
                return index;
            }
        }

        return -1;
    }

    public static int count(int valueToSearch, int[] values) {

        int count = 0;
//        for (int value : values) {
//            if (value == valueToSearch) {
//                count++;
//            }
//        }
//        return count;

//        int startIndex = -1;
//        while ( (startIndex = indexOf(valueToSearch, values, startIndex+1, values.length)) != -1 ) {
//            count++;
//        }

        for ( int startIndex = -1;  (startIndex = indexOf(valueToSearch, values, startIndex+1, values.length)) != -1 ; count++ );

        return count;

    }

    public static void showValues(int[][] values) {
        for( int row = 0 ; row < values.length ; row++ ){
            System.out.println(Arrays.toString(values[row]));
        }
    }

    public static int[][] filterValues(int[] values) {

        return new int[][]{
                filterEvenValues(values),
                //filterOddValues(values) // can use this also
                filterValues(values, 1)
        };
    }

    public static int[] totals(int[][] values, int totalType) {

        int []total = new int[0];

        switch (totalType){
            case TYPE_ROW:
                // row total
                total = new int[values.length];

                for( int row = 0 ; row < values.length ; row++ ){
//                    for( int col = 0 ; col < values[row].length ; col++ ){
//                        total[row] += values[row][col];
//                    }
                    total[row] =  computeTotal(values[row]);
                }

                break;
            case TYPE_COL:

                // find the row which has max number of cols
                int maxCols = findMaxCols(values);

                // col total
                total = new int[maxCols];

                for( int row = 0 ; row < values.length ; row++ ){
                    for( int col = 0 ; col < values[row].length ; col++ ){
                        total[col] += values[row][col];
                    }
                }

                break;
        }



        return total;
    }

    private static int findMaxCols(int[][] values) {

        int max = 0;
        for( int row = 0 ; row < values.length ; row++ ){

            if( max < values[row].length ){
                max = values[row].length;
            }

        }

        return max;
    }

    public static int findMinimum(int[] values) {

        int initialValue = values[0];

        for( int index = 1 ; index < values.length ; index++ ){
            if(values[index] < initialValue ) {
                initialValue = values[index];
            }
        }

        return initialValue;
    }

    public static int findMaximum(int[] values) {
        int initialValue = values[0];

        for( int index = 1 ; index < values.length ; index++ ){
            if( values[index] > initialValue ) {
                initialValue = values[index];
            }
        }

        return initialValue;
    }

    public static int[] sort(int[] values, SORT sortType) {

        int []arrayToBeSorted;

        switch (sortType){
            case ASCENDING:

                arrayToBeSorted = Arrays.copyOf(values, values.length);
                Arrays.sort(arrayToBeSorted);
                return arrayToBeSorted;

//            Arrays.sort(values);
//            return values;

            case DESCENDING:

                arrayToBeSorted = Arrays.copyOf(values, values.length);

                // selection sort

                // compare a reference value with each next current value in the array
                for( int rIndex = 0 ; rIndex < arrayToBeSorted.length ; rIndex++ ){

                    // current value to compare is to be started from the next index of reference value
                    for( int cIndex = rIndex+1 ; cIndex < arrayToBeSorted.length ; cIndex++ ){

                        // compare if the reference value is larger than the current value
                        if( arrayToBeSorted[cIndex] > arrayToBeSorted[rIndex] ){

                            // swap the values

                            // variant 1
//                            int temp ;
//                            temp = arrayToBeSorted[rIndex];
//                            arrayToBeSorted[rIndex] = arrayToBeSorted[cIndex];
//                            arrayToBeSorted[cIndex] = temp;

                            // variant 2
//                            arrayToBeSorted[rIndex] = arrayToBeSorted[rIndex] + arrayToBeSorted[cIndex];
//                            arrayToBeSorted[cIndex] = arrayToBeSorted[rIndex] - arrayToBeSorted[cIndex];
//                            arrayToBeSorted[rIndex] = arrayToBeSorted[rIndex] - arrayToBeSorted[cIndex];

                            // variant 3
                            arrayToBeSorted[rIndex] ^= arrayToBeSorted[cIndex];
                            arrayToBeSorted[cIndex] ^= arrayToBeSorted[rIndex];
                            arrayToBeSorted[rIndex] ^= arrayToBeSorted[cIndex];

                        }

                    }

                }

                return arrayToBeSorted;
        }

        return new int[0];
    }
}
