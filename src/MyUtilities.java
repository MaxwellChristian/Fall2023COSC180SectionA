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

    private static void test(){

    }

    private static int[] filterEvenValues(int[] values) {

        int []filteredValues = new int[values.length];
        int destPos = 0 ;

        for( int sourcePos = 0 ; sourcePos < values.length ; sourcePos++ ){
            if( values[sourcePos] % 2 == 0 ){
                filteredValues[destPos] = values[sourcePos];
                destPos++;
            }
        }

        return Arrays.copyOfRange(filteredValues, 0, destPos);
    }

    private static int[] filterOddValues(int[] values) {
        int []filteredValues = new int[values.length];
        int destPos = 0 ;

        for( int sourcePos = 0 ; sourcePos < values.length ; sourcePos++ ){
            if( values[sourcePos] % 2 != 0 ){
                filteredValues[destPos] = values[sourcePos];
                destPos++;
            }
        }

        return Arrays.copyOfRange(filteredValues, 0, destPos);
    }

    public static int[] filterValues(int[] values, int valueType) {

        switch (valueType){
            case 0:
                return filterEvenValues(values);
            case 1:
                return filterOddValues(values);
        }

        return values;
    }
}
