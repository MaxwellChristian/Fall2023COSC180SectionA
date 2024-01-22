package lo_sorting;

import java.util.Arrays;

/*
* Bubble sort demo
* Try to :
*   1. display the total swaps performed in each pass
*   2. put the sorting logic in a dedicated method
*   3. perform the swap using a method
* */

public class BubbleSortDemo {

    public static void main(String []args) {

        int []values = {9, 18, 2, 5, 4};

        System.out.println("Before sorting : " + Arrays.toString(values));

        // sorting
        for( int i = 0 ; i < values.length ; i++ ){

            // compare each adjacent value
            for( int j = 0 ; j < values.length - 1 - i ; j++ ){

                // check adjacent values
                if( values[j] > values[j+1] ){
                    // swap the values
                    int temp;
                    temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;
                }

            }

            System.out.printf("Pass %d: %s\n", i, Arrays.toString(values));

        }

        System.out.println("After sorting  : " + Arrays.toString(values));

    }

}
