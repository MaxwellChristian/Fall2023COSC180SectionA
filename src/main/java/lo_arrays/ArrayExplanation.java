package lo_arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayExplanation {

    public static void main(String[] args) {

        int i = 1;

        while (i < 10) {

            if ((i++) % 2 == 0) {

                System.out.print(i + " ");

            }

        }

        System.out.println();
        System.out.println();
        System.out.println();

        int []values = {1, 1, 1, 1, 1};
        Arrays.fill(values, 2);



        char cVal = (char) (i+32);
        String sResult = (cVal > 32 && cVal < 127 ? "Printable Character" : "UnPrintable Character");




        int r, c;

        for (r = 1; r <= 3; r++) ;

        {

            for (c = 0; c < 2; c++) {

                System.out.print(r + " " + c + "\t");

            }

            System.out.println();

        }

        System.out.println();
        System.out.println();
        System.out.println();

        int nVal1 = 21;

        int nVal2 = 2;

        double dResult = nVal1 / nVal2;

        System.out.println("Dresult : " + dResult);

        // arrays are used to store multiple value of same type
        // i.e. arrays will always have the same data type

        // arrays always need to have a size defined

        int[] iValues = new int[5];
        // here 'iValues' is the array which can store 5 int values

        // examples
        boolean[] ka = new boolean[10];
        double[] d = new double[11];

        // float []f = new int[10]; // in-valid as types are not matching


        // they can store values upto size defined
        // value storage starts from 0 index

        ka[0] = true;
        ka[1] = true;
        ka[2] = false;
        ka[3] = true;
        ka[4] = true;
        ka[5] = true;
        ka[6] = false;
        ka[7] = true;
        ka[8] = true;
        ka[9] = true;

        for (int pos = 0; pos < ka.length; pos++) {
            if (pos == 2 || pos == 6) {
                ka[pos] = false;
            } else {
                ka[pos] = true;
            }

        }

        // ka[10] = true;  // invalid as 10 is not a valid index for size 10

        d = new double[15];
        for (int pos = 0; pos < 15; pos++) {
            // d[pos] = 11.25;
            d[pos] = new Random().nextDouble(57.25);
        }

        d = new double[25];
        for (int index = 0; index < 25; index++) {
            // d[index] = 11.25;
            d[index] = new Random().nextDouble(57.25);
        }

//        d = new double[5];
//        for( int counter = 0 ; counter < 25 ; counter++ ){
//            // d[index] = 11.25;
//            d[counter] = new Random().nextDouble(57.25);
//        }

        int[] nums = {10, 15, 2, 78, 11};

        char[] cArr = {'A', 'n', 'k', 'u', 's', 'h'};
        for (int pos = 0; pos < cArr.length; pos++) {
            System.out.println(cArr[pos]);
        }


        System.out.println("char size: " + Character.SIZE);


        String name = "Ankush";
        for (int pos = 0; pos < name.length(); pos++) {
            System.out.println(name.charAt(pos));
        }


        String text = "My name is Maxwell";
        String[] words = text.split(" ");
        for (int pos = words.length - 1; pos >= 0; pos--) {
            System.out.println(words[pos]);
        }


    }

}
