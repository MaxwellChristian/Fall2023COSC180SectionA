package lo_generics;

import lo_inheritance.Circle;

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

        // find largest of all the int values [using generic method]
        Integer maxInt = GenericMethods.largest(iValues);
        System.out.println("Max : " + maxInt);

        // find largest of all the string values [using generic method]
        String maxStr = GenericMethods.largest(sValues);
        System.out.println("Max : " + maxStr);

        // find largest of all the circle values [using generic method]
        Circle maxCircle = GenericMethods.largest(c);
        System.out.println("Max : " + maxCircle);

    }

    private static int findMax( int []values ){

        int max = values[0];
        for( int i = 1 ; i < values.length ; i++ ){
            if( values[i] > max ){
                max = values[i];
            }
        }

        return max;
    }

    private static String findMax( String []values ){

        String max = values[0];
        for( int i = 1 ; i < values.length ; i++ ){
            if( values[i].compareTo(max) > 0 ){
                max = values[i];
            }
        }

        return max;
    }

    private static <T> T findMaxGeneric( T []values ){
        return null;
    }

//    public static <T extends Comparable<T>> T largest(T[] values) {
//
//        T largest = values[0];
//
//        for (int index = 1; index < values.length; index++) {
//            if( values[index].compareTo(largest) > 0 ){
//                largest = values[index];
//            }
//        }
//
//        return largest;
//    }

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
