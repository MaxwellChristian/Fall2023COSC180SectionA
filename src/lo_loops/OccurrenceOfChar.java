package lo_loops;

import java.util.Scanner;

// Count the number of times that the letter 'a' occurs on that line.
public class OccurrenceOfChar {

    public static void main(String []aq54r8g) {

        // declaration

        // variable to capture line of text
        String line;

        // variable to capture the character to count
        char charToCount;

        // configure the input line
        Scanner in = new Scanner(System.in);

        // prompt the user to enter the line of text
        System.out.print("Enter a line of text: ");
        line = in.nextLine();

        // prompt the user to enter the character to count
        System.out.print("Enter a character: ");
        charToCount = in.next().charAt(0);
        // input as string and extract the first character
        // i.e., the character at index 0

        // count the occurrence of character from the line of text
        int totalOccurrences = 0;
        for( int pos = 0 ; pos < line.length() ; pos++ ){

            if( charToCount == line.charAt(pos) ){
                totalOccurrences++;
            }

        }

        // display the calculated count of occurrences
        System.out.printf("'%c' occurs %d times in '%s'", charToCount, totalOccurrences, line);

    }

}
