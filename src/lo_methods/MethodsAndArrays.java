package lo_methods;

import java.util.Arrays;

public class MethodsAndArrays {

    public static void main(String []args) {

        // call/invoke a method which returns an array filled with random numbers
        int []values = generateRandomArray(20, 100);
        int []binaryValues = generateRandomArray(20);

        System.out.println(Arrays.toString(values));
        System.out.println(Arrays.toString(binaryValues));

        boolean has55 = arrContains(values, 55);
        System.out.println("55 exists in array : " + has55 );

    }

    private static boolean arrContains(int[] values, int valueToCheck) {

        for (int currentValue: values){
            if( currentValue == valueToCheck ){
                return true;
            }
        }
        return false;
    }

    private static int[] generateRandomArray(int totalValues, int maxValuePermitted) {
        int []arrToReturn = new int[totalValues];
        for( int index = 0 ; index < arrToReturn.length ; index++ ){
            arrToReturn[index] = (int) (Math.random()*maxValuePermitted);
        }

        return arrToReturn;
    }

    private static int[] generateRandomArray(int totalValuesRequired) {
        return generateRandomArray(totalValuesRequired, 2);
    }

}
