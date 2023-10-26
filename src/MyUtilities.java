import java.util.Arrays;

public class MyUtilities {
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
            case 0:
                return filterEvenValues(values);
            case 1:
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
        for (int value : values) {
            if (value == valueToSearch) {
                count++;
            }
        }
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
}
