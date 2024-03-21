package lo_generics;

public class GenericMethods {

    public static <T extends Comparable<T>> T largest(T[] values) {

        T largest = values[0];

        for (int index = 1; index < values.length; index++) {
            if( values[index].compareTo(largest) > 0 ){
                largest = values[index];
            }
        }

        return largest;
    }

}
