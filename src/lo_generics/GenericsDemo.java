package lo_generics;

import java.util.Arrays;

public class GenericsDemo {

    public static void main(String []args) {

        Integer []iValues = {11, 22, 33, 44, 55};
        String []sValues = {"AA", "BB", "CC" };

        showIntValues(iValues);
        showTextValues(sValues);


    }

    private static void showTextValues(String[] sValues) {
        System.out.println(Arrays.toString(sValues));
    }

    private static void showIntValues(Integer[] iValues) {
        System.out.println(Arrays.toString(iValues));
    }



}
