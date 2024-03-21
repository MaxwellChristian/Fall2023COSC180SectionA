package lo_functional_programming;

import java.util.Arrays;

public class StreamDemo3 {

    public static void main(String []args) {

        int[] values = {3, 4, 1, 5, 20, 1, 3, 3, 4, 6};

        System.out.println("Values: " + Arrays.toString(values));

        // adding each value i.e. ans = v1 + v2 ... + vN
        System.out.println("Values [sum]: " + Arrays.stream(values).sum());
        // System.out.println("Values [sum]: " + Arrays.stream(values).reduce(0, Integer::sum));

        // multiplying each value i.e. ans = v1 * v2 ... * vN
        System.out.println("Values [mul]: " + Arrays.stream(values).reduce(1, (left, right) -> left * right));

        // display as CSV

        // the following displays an extra comma at the end
        // Arrays.stream(values).forEach(value -> System.out.print(value + ", "));
        System.out.println(
                Arrays.stream(values)
                        .mapToObj(String::valueOf)
                        .reduce((left, right) -> left + ", " + right)
                        .get()
        );
    }

}
