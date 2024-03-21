package lo_arrays;

public class ArrayIntro {

    public static void main(String []args){

        int []arr = new int[15];
        // an int array that can store 5 values. Not more than 5
        // array always starts at index 0

//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 35;
//        arr[3] = 47;
//        arr[4] = 58;
        // arr[5] = 68; // here the index is out of bounds

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);

//        for (int index = 0 ; index < 5 ; index++ ){
//            arr[index] = (int) (Math.random()*25);
//            System.out.println("At " + index + " : " + arr[index] );
//        }

        // using the length of the given array
        for (int index = 0 ; index < arr.length ; index++ ){
            arr[index] = (int) (Math.random()*25);
            System.out.println("At " + index + " : " + arr[index] );
        }

    }

}
