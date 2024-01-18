package lo_generics;

import lo_inheritance.Circle;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericsDemo {

    public static void main(String []args) {

        Integer []iValues = {11, 22, 33, 44, 55};
        String []sValues = {"AA", "BB", "CC" };

        Circle []c = new Circle[3];
        c[0] = new Circle(11);
        c[1] = new Circle(22);
        c[2] = new Circle(33);

//        showIntValues(iValues);
//        showTextValues(sValues);

        showValues(iValues);
        showValues(sValues);

        showValues(c);

    }

    private static <E> void showValues(E []values) {
        for (E value: values) {
            System.out.println(value);
        }
    }

    private static void showTextValues(String[] sValues) {
        for (String value: sValues) {
            System.out.println(value);
        }
    }

    private static void showIntValues(Integer[] iValues) {
        for (Integer value: iValues) {
            System.out.println(value);
        }
    }


}
