package lo_methods;

import java.util.Stack;

public class MethodIntro {

    // this is a method named 'main'
    // it has a single parameter named 'args'
    // the data type of the parameter is 'String []'
    // the return type of the method is 'void' i.e. it does not return anything
    public static void main(String[] args) {

        int x;
        int y;
        int z;

        // find the maximum of the 3 numbers using a user-defined method

        x = 5;
        y = 7;
        z = 9;
        max3(x, y, z);

        // call to the method named 'max3'
        // passing 3 parameters of type 'int' to 'max3'
        // expecting a return value from 'max3'

        x = 50;
        y = 17;
        z = 99;

        // 'x', 'y' and 'z' are actual parameters
        // the actual parameters will be copied to formal parameters
        int largestNumber = max3(x, y, z);

        System.out.println("Largest : " + largestNumber);

        largestNumber = max3(x * 200, y / 5, z * 10);
        System.out.println("Largest : " + largestNumber);

        x = 90;
        int ans = divideBy3(x); // after the call the statement will be ans = 30
        System.out.println("Result of " + x + " / 3 : " + ans);

        y = 90;
        y = divideBy3(y); // after the call the statement will be y = 30
        System.out.println("Result of " + y + " / 3 : " + y);
    }

    private static int divideBy3(int x) {
        x = x / 3;
        return x;
    }

    // 'value1', 'value2', 'value3' are 'formal parameters'
    // formal parameters will receive a copy of 'actual parameters'
    static int max3(int value1, int value2, int value3) {

        if (value1 > value2) {
            if (value1 > value3) {
                return value1;
            } else {
                return value3;
            }
        } else {
            if (value2 > value3) {
                return value2;
            } else {
                return value3;
            }
        }

//        return 0;
    }

    // write a user - defined method to find max of two numbers
    static int max2(int value1, int value2) {

        if (value1 > value2) {
            return value1;
        } else {
            return value2;
        }

        // return 0;
    }

    static int maxOf3( int v1, int v2, int v3 ){

        return max2(v1, max2(v2, v3));

    }

}

