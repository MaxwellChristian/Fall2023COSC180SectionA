package lo_functional_programming;

import java.util.Arrays;
import java.util.Random;

public class StreamDemo2 {

    public static void main(String []args) {

        Random random = new Random();
        int []values = random.ints(200_000_000).toArray();

        // write a method which sorts the values and also returns the time consumed to sort
        // the sorted values should be kept separate than the original values
        // use streams
        int []sortedValues1 = new int[values.length];
        long timeConsumed1 = sortSequential(values, sortedValues1);
        System.out.println("Time [sequential] : " + timeConsumed1 + " ms");

        // number of processors
        System.out.println("Number of processors: " + Runtime.getRuntime().availableProcessors());

        int []sortedValues2 = new int[values.length];
        long timeConsumed2 = sortParallel(values, sortedValues2);
        System.out.println("Time [parallel]   : " + timeConsumed2 + " ms");

    }

    private static long sortParallel(int[] values, int[] sortedValues) {
        long startTime = System.currentTimeMillis();
        sortedValues = Arrays.stream(values).parallel().filter(value -> value > 0).sorted().toArray();
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }

    private static long sortSequential(int[] values, int[] sortedValues) {

        long startTime = System.currentTimeMillis();
        sortedValues = Arrays.stream(values).filter(value -> value > 0).sorted().toArray();
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }

}
