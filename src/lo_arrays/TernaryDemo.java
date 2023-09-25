package lo_arrays;

// display the following if a number is divisible by 5 or not

// 25: divisible by 5 : Yes
// 27: divisible by 5 : No

public class TernaryDemo {

    public static void main(String []args){

        int num = 25;

        if( num%5 == 0 ){
            System.out.println("Divisible by 5: Yes");
        }
        else {
            System.out.println("Divisible by 5: No");
        }

        // using ternary operator
        // syntax :
        // (condition) ? TRUE-PART : FALSE-PART

        String output = (num%5 == 0) ? "Divisible by 5: Yes" : "Divisible by 5: No";
        System.out.println(output);

        System.out.println("Divisible by 5: " + ((num%5==0) ? "Yes" : "NO") );

        /*
        int n1= 5;
        int n2 = 7;
        System.out.println("Larger number is " + ( (n1>n2) ? n1 : n2 ) );

         */

    }

}
