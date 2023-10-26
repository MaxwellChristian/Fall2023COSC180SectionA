import java.util.Arrays;

public class TestMethods {

    private static final int TOTAL_VALUES_REQUIRED = 10;
    private static final int MAX_VALUE_PERMITTED = 5;

    public static void main(String[] args) {

        int []values = MyUtilities.generateValues( TOTAL_VALUES_REQUIRED, MAX_VALUE_PERMITTED );

        System.out.println(Arrays.toString(values));

        // compute the summation of all values generated
        int sum = MyUtilities.computeTotal(values);

        // display the computed summation
        System.out.println("Sum: " + sum);

        // get an array with even values from the generated array
        // [using a method from MyUtilities]
//        int []evenValues = MyUtilities.filterEvenValues(values);
//        System.out.println(Arrays.toString(evenValues));

        // get an array with odd values from the generated array
        // [using a method from MyUtilities]
//        int []oddValues = MyUtilities.filterOddValues(values);
//        System.out.println(Arrays.toString(oddValues));

        final int TYPE_EVEN = 0;
        final int TYPE_ODD = 1;

        int []valuesEven = MyUtilities.filterValues(values, TYPE_EVEN);
        System.out.println(Arrays.toString(valuesEven));

        int []valuesOdd = MyUtilities.filterValues(values, TYPE_ODD);
        System.out.println(Arrays.toString(valuesOdd));

        // write methods for following

        // from an array search a value and return the available index

        // from an array count the occurences of a value

        // display a 2D array using a method

    }

}
