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

//        final int TYPE_EVEN = 1;
//        final int TYPE_ODD = 0;

        int []valuesEven = MyUtilities.filterValues(values, MyUtilities.TYPE_EVEN);
        System.out.println("Even: " + Arrays.toString(valuesEven));

        int []valuesOdd = MyUtilities.filterValues(values, MyUtilities.TYPE_ODD);
        System.out.println("Odd: " + Arrays.toString(valuesOdd));

        int []valuesPrime = MyUtilities.filterValues(values, MyUtilities.TYPE_PRIME);
        System.out.println("Odd: " + Arrays.toString(valuesPrime));

        // write methods for following

        // from an array search a value and return the available index
        int valueToSearch = 3;
        int foundAtIndex = MyUtilities.indexOf(valueToSearch, values, 0, values.length);
        if( foundAtIndex != -1 ){
            System.out.printf("%d found at %d\n", valueToSearch, foundAtIndex);
        }
        else {
            System.out.println( valueToSearch + " not found");
        }

        // from an array count the occurrences of a value
        int countOccurrences = MyUtilities.count(valueToSearch, values);
        System.out.println( valueToSearch + " occurs " + countOccurrences + " times");

        // display a 2D array using a method
        // a "jagged" array
        int [][]matrix = {
                {10, 20, 30, 40, 50},
                {11, 22, 33},
                {-1, -2, -3, -4},
                {-1, -2},
                {-1, -2, -3, -4},
                {-1, -2, -3, -4, -5}
        };
        MyUtilities.showValues(matrix);

        // write a method which takes series of values and
        // returns two arrays where
        // first array holds all even values and
        // second array holds all odd values
        // hint: you can return a 2D array

        int [][]filteredEvenOdd = MyUtilities.filterValues(values);
        MyUtilities.showValues(filteredEvenOdd);

        int []rowTotals = MyUtilities.totals(matrix, MyUtilities.TYPE_ROW);
        System.out.println("Row totals: " + Arrays.toString(rowTotals));

        int []colTotals = MyUtilities.totals(matrix, MyUtilities.TYPE_COL);
        System.out.println("Col totals: " + Arrays.toString(colTotals));

        int min = findMinimum(values);  // find the minimum from a 1D array
        System.out.println("Minimum: " + min);

        int max = findMaximum(values);  // find the maximum from a 1D array
        System.out.println("Maximum: " + max);

    }

}
