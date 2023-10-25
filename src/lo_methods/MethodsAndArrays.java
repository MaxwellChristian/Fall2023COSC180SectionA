package lo_methods;

import java.util.Arrays;

public class MethodsAndArrays {

    public static void main(String[] args) {

        // call/invoke a method which returns an array filled with random numbers
        int[] values = generateRandomArray(20, 10);
        int[] binaryValues = generateRandomArray(20);

        System.out.println(Arrays.toString(values));
        System.out.println(Arrays.toString(binaryValues));

//        boolean has3 = arrContains(values, 3) > 0;
        System.out.println("3 exists in array : " + (indexInArray(values, 0, values.length, 3) != -1));

        // modify/add the function to count the total times 55 occurs in random generated array
        int count3 = arrContains(values, 3);
        System.out.println("3 occurs in array " + count3 + " times ");

        int positionFound = indexInArray(values, 0, values.length, 3);
        if (positionFound != -1) {
            System.out.println("3 found at : " + positionFound);
        } else {
            System.out.println("3 does not exist in the array");
        }

        // create a new array which holds values after the first occurence of 3
        int secondPosition = indexInArray(values, positionFound+1, values.length, 3);

        int lastPosition = lastIndexInArray(values, 3);

//        int valueToSearch = 3;
//        int foundAtPosition = ArrayUtilities.search(values, 0, values.length, valueToSearch);

    }

    private static int lastIndexInArray(int[] values, int valueToCheck) {
        for (int position = values.length-1 ; position >= 0 ; position--) {
            if (values[position] == valueToCheck) {
                return position;
            }
        }
        return -1;
    }

    private static int indexInArray(int[] values, int startPosition, int endPosition, int valueToCheck) {
        for (int position = startPosition ; position < endPosition ; position++) {
            if (values[position] == valueToCheck) {
                return position;
            }
            position++;
        }
        return -1;
    }

    private static int arrContains(int[] values, int valueToCheck) {

        int count = 0;
        for (int currentValue : values) {
            if (currentValue == valueToCheck) {
                count++;
            }
        }
        return count;
    }

    private static int[] generateRandomArray(int totalValues, int maxValuePermitted) {
        int[] arrToReturn = new int[totalValues];
        for (int index = 0; index < arrToReturn.length; index++) {
            arrToReturn[index] = (int) (Math.random() * maxValuePermitted);
        }

        return arrToReturn;
    }

    private static int[] generateRandomArray(int totalValuesRequired) {
        return generateRandomArray(totalValuesRequired, 2);
    }

}
