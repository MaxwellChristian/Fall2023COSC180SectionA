package lo_loops;

/*
* Write a program which will take an input of a line of text from the user and then
* display all vowels on a single line followed by all consonants on another line.
* Vowel list should be delimited using spaces and
* consonants should be delimited using commas.
*
* Ex:
* text = Welcome to JAVA
* vowels : e o e o A A
* consonants : W, l, c, m , t, J, V
* */

import java.util.Scanner;

public class VowelsAndConsonants {

    public static void main(String []args) {

        // declaration
        String text;

        char []vowels;
        // char []consonants;

        int vowelCounter;
        int consonantCounter;

        // input
        Scanner inputLine = new Scanner(System.in);

        System.out.print("Enter text : ");
        text = inputLine.nextLine();

        vowels = new char[text.length()];
        char []consonants = new char[text.length()];

        vowelCounter = consonantCounter = 0;

        int index;
        for( index = 0; index < text.length() ; index++ ){
            //System.out.println(text.charAt(index));

            // extract each character
            char ch = text.charAt(index);

            // check for alphabets
            if( ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ){
                //System.out.println(ch);

                // check for vowel or consonant
                if( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
                || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){

                    // append to the vowel list
                    vowels[vowelCounter] = ch;
                    vowelCounter++;

                }
                else {
                    // append to the consonant list
                    consonants[consonantCounter++] = ch;
                }

            }

        }

        // display all the vowels
        System.out.print("Vowels : ");
        for (index = 0 ; index < vowelCounter ; index++){
            System.out.print(vowels[index] + " ");
        }

        // blank line
        System.out.println();

        // display all the consonants
        System.out.print("Consonants : ");
        for (index = 0 ; index < consonantCounter ; index++){
            System.out.print(consonants[index] + " ");
        }

    }

}
