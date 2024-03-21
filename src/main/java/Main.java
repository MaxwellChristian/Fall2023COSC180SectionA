import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // write a code which finds[counts] all values larger than 50 from a list of values [in array]
        int []values = {11, 98, 19, 51, 50, 11, 89, 17};

        int count = 0;
        for (int value: values) {
            if( value > 50 ){
                count++;
            }
        }

        System.out.println("Values > 50 : " + count);

        System.out.println("Values > 50 : " + Arrays.stream(values).filter(value -> value > 50).count());

    }
}