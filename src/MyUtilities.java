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
}
