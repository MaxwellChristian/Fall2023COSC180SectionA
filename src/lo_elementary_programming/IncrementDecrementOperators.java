package lo_elementary_programming;

import java.sql.SQLSyntaxErrorException;

public class IncrementDecrementOperators {

    public static void main(String []args) {

        int x;
        int y;

        x = 5 ;
        System.out.println("x : " + x);

        x = x + 1;
        System.out.println("x : " + x);

        x += 1;
        System.out.println("x : " + x);

        x++;    // adds/increments 1 to x
        // known as postfix
        System.out.println("x : " + x);

        ++x;    // adds/increments 1 to x
        // known as prefix
        System.out.println("x : " + x);


        x = 5;
        y = x++;
        System.out.println("x : " + x + ", y : " + y);

        x = 5;
        y = ++x;
        System.out.println("x : " + x + ", y : " + y);

    }

}
