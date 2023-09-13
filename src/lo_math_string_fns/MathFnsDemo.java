package lo_math_string_fns;

public class MathFnsDemo {

    public static void main(String []args){

        // demonstration of math functions

        // pow -> returns the power of x to y
        System.out.printf("pow of 5 to 7 : %.0f\n", Math.pow(5, 7) );

        System.out.printf("ABS of -7.89 : %f\n", Math.abs(-7.89) );

        System.out.printf("Square root of -7.89 : %f\n", Math.sqrt(-7.89) );
        System.out.printf("Square root of 7.89 : %f\n", Math.sqrt(7.89) );

        System.out.printf("Round of 7.44 : %d\n", Math.round(7.44) );
        System.out.printf("Ceil of 7.44 : %f\n", Math.ceil(7.44) );
        System.out.printf("Floor of 7.44 : %f\n", Math.floor(7.44) );

        // random returns a double value between 0.0 and 1.0
        System.out.printf("Generated random : %f\n", Math.random());
        System.out.printf("Generated random : %f\n", Math.random());
        System.out.printf("Generated random : %f\n", Math.random());

        // generate a random number upto 5
        System.out.printf("Generated random : %f\n", Math.random() * 5 );
    }

}
