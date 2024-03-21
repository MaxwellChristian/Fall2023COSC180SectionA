package lo_elementary_programming;

public class OperatorsDemo {

    public static void main(String []a4rgs) {

        // demonstrating use of operators

        // arithmetic operators
        System.out.println("5 + 2 = " + (5 + 2) ) ;     // addition
        System.out.println("5 - 2 = " + (5 - 2) ) ;     // subtraction
        System.out.println("5 * 2 = " + (5 * 2) ) ;     // multiplication
        System.out.println("5 / 2 = " + (5 / 2) ) ;     // division (when used with int, returns quotient)
        System.out.println("5 % 2 = " + (5 % 2) ) ;     // division - modulo operator (can be used with int and returns the remainder)

        // relational operators
        System.out.println("5 < 2   = " + (5 < 2) ) ;
        System.out.println("2 < 2   = " + (2 < 2) ) ;

        System.out.println("5 <= 2  = " + (5 <= 2) ) ;
        System.out.println("2 <= 2  = " + (2 <= 2) ) ;

        System.out.println("5 > 2   = " + (5 > 2) ) ;
        System.out.println("2 > 2   = " + (2 > 2) ) ;

        System.out.println("5 >= 2  = " + (5 >= 2) ) ;
        System.out.println("2 >= 2  = " + (2 >= 2) ) ;

        System.out.println("5 == 2  = " + (5 == 2) ) ;  // comparison operator - equals to (checks for equality)
        System.out.println("5 != 2  = " + (5 != 2) ) ;  // not equals to

        int x;
        int y;

        // increment operators
        x = 7;
        y = 0;
        System.out.println("x : " + x + ", y : " + y);
        y = x + 1;
        System.out.println("x : " + x + ", y : " + y);
        x = x + 1;
        System.out.println("x : " + x + ", y : " + y);


        x = 7;
        y = 0;
        x = x + 1 ;
        System.out.println("x = x + 1 -> x : " + x + ", y : " + y);

        x = 7;
        y = 0;
        // incrementing x using shorthand operator +=
        x += 1 ;    // increments x by 1 and stores in x
        System.out.println("x += 1 -> x : " + x + ", y : " + y);

        x = 7;
        y = 0;
        System.out.println("x : " + x + ", y : " + y);
        // incrementing y using shorthand operator +=
        y += x ;    // i.e., y = y + x -> increments y by x and stores in y
        System.out.println("y += x -> x : " + x + ", y : " + y);

        System.out.println();   // a blank line

        x = 5;
        y = 7;
        System.out.println("x : " + x + ", y : " + y);
        // incrementing y using shorthand operator +=
        y += x ;    // i.e., y = y + x -> increments y by x and stores in y
        System.out.println("y += x -> x : " + x + ", y : " + y);

        System.out.println();   // a blank line

        x = 5;
        y = 7;
        System.out.println("x : " + x + ", y : " + y);
        // incrementing y using shorthand operator -=
        y -= x ;    // i.e., y = y - x
        System.out.println("y -= x -> x : " + x + ", y : " + y);

        System.out.println();   // a blank line

        x = 5;
        y = 7;
        System.out.println("x : " + x + ", y : " + y);
        // incrementing y using shorthand operator -=
        y *= x ;    // i.e., y = y * x
        System.out.println("y *= x -> x : " + x + ", y : " + y);

        System.out.println();   // a blank line

        x = 5;
        y = 7;
        System.out.println("x : " + x + ", y : " + y);
        // incrementing y using shorthand operator -=
        y /= x ;    // i.e., y = y / x
        System.out.println("y /= x -> x : " + x + ", y : " + y);

        System.out.println();   // a blank line

        x = 5;
        y = 7;
        System.out.println("x : " + x + ", y : " + y);
        // incrementing y using shorthand operator -=
        y %= x ;    // i.e., y = y % x
        System.out.println("y %= x -> x : " + x + ", y : " + y);

        System.out.println();   // a blank line

        // demonstrating with char type
        char ch = 'J';
        int ans ;

        ans = ch + 1;   // adds 1 to the ASCII of ch and stores in ans i.e. returns the number
        System.out.println("ans = ch + 1 -> ch: " + ch + ", ans : " + ans + ", " + (char)ans );

        // ch = ans;   // not allowed
        ch = (char) ans;   // works because of type casting
        // always specify the destination type for casting



    }

}
