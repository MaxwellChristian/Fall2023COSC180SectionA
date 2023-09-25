package lo_arrays;

/*
* Write a program which will take input of a line of text and then
* print the following:
* - count of all digits and display all extracted digits
* - count of all upper case characters
* - count of all lower case characters
* - count of all special characters
* */

import javax.swing.text.html.HTMLEditorKit;
import java.util.Scanner;

public class TextStatistics {

    public static void main(String []arsg__2s){

        // declaration
        String text;

        // input
        Scanner inputLine = new Scanner(System.in);

        System.out.print("Enter text : ");
        text = inputLine.nextLine();

        int digitCounter = 0;
        int lowerCaseCounter = 0;
        int upperCaseCounter = 0;
        int specialCharCounter = 0;

        int index;
        for (index = 0 ; index < text.length() ; ++index ) {

            char ch = text.charAt(index);

            // note that the ZERO and NINE are in single quotes
            // so they are characters and not integers
            /*
            if( ch >= '0' && ch <= '9' ){

            }

             */

            // alternate approach
            if( Character.isDigit(ch) ){
                digitCounter++;
            }
            else {
                if( Character.isLowerCase(ch) ){
                    lowerCaseCounter++;
                }
                else {
                    if( Character.isUpperCase(ch) ){
                        upperCaseCounter++;
                    }
                    else {
                        specialCharCounter++;
                    }
                }
            }

        }

        // display all the statistics
        System.out.println("Digits: " + digitCounter);
        System.out.println("Lower case chars: " + lowerCaseCounter);
        System.out.println("Upper case chars: " + upperCaseCounter);
        System.out.println("Special chars: " + specialCharCounter);

    }

}
