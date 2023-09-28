package lo_methods;

/*
 * Write a program which takes input of a line of text and
 * displays all words from the text with a count of prime characters in each word
 *
 * sample : java is simple
 * java     :   2
 * is       :   0
 * simple   :   2
 *
 * */

import java.util.Scanner;

public class PrimeCharacter2 {

    public static void main(String[] args) {

        String text;

        Scanner inputLine = new Scanner(System.in);

        System.out.print("Enter text: ");
        text = inputLine.nextLine();
/*
        for (int index = 0; index < text.length(); index++) {

            char ch = text.charAt(index);
            if (isPrime(ch)) {
                System.out.println(ch + ": " + ((int) ch));
            }

        }
        */

        // for( char ch: ['j', 'a', 'v', 'a'] )

        for( char ch: text.toCharArray() ){
            if (isPrime(ch)) {
                System.out.println(ch + ": " + ((int) ch));
            }
        }


    }

    private static boolean isPrime(int value) {

        for (int divisor = 2; divisor < value; divisor++) {
            if (value % divisor == 0) {
                return false;
            }
        }

        return true;
    }

}
