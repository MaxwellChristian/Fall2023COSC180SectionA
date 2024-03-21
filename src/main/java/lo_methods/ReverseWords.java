package lo_methods;

import java.util.Scanner;

/*
* Write a program to input a whole line of text and display
* all the words of the text [each word in separate line]
* */

public class ReverseWords {

    public static void main(String[] args) {

        String text;

        Scanner inputLine = new Scanner(System.in);

        System.out.print("Enter text: ");
        text = inputLine.nextLine();

        // String[] words = text.split(" ");
        // display each word reversed
        for (String word : text.split(" ")) {
            System.out.println(new StringBuilder(word).reverse());
        }

        // print all characters on each line
//        for( int pos = 0 ; pos < text.length() ; pos++ ){
//            char ch = text.charAt(pos);
//            System.out.println(ch);
//
//        }

        // split all characters
        for (String ch : text.split("")) {
            System.out.println(ch);
        }

        // split all lines and display reverse of each line
        for (String line : text.split("\\.")) {
            System.out.println( new StringBuilder(line).reverse() );
        }

    }

}
