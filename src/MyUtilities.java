import java.util.Arrays;

public class MyUtilities {
    public static final int TYPE_EVEN = 0;
    public static final int TYPE_ODD = 1;
    public static final int TYPE_PRIME = 2;
    public static final int TYPE_ROW = 0;
    public static final int TYPE_COL = 1;

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
}
