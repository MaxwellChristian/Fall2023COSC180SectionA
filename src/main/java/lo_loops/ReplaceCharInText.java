package lo_loops;

import java.util.Scanner;

// Replace a character in a line of text
public class ReplaceCharInText {

    public static void main(String []aq54r8g) {

        // declaration

        // variable to capture line of text
        String line;

        // variable to capture the character to count
        char charToReplace;
        char replacingChar;

        // configure the input line
        Scanner in = new Scanner(System.in);

        // prompt the user to enter the line of text
        System.out.print("Enter a line of text: ");
        line = in.nextLine();

        // prompt the user to enter the character to replace
        System.out.print("Enter the character to replace: ");
        charToReplace = in.next().charAt(0);
        // input as string and extract the first character
        // i.e., the character at index 0

        // prompt the user to enter the character to be replaced by
        System.out.print("Enter the new character to replace old char: ");
        replacingChar = in.next().charAt(0);
        // input as string and extract the first character
        // i.e., the character at index 0

        // replace the character from the line of text
        int totalOccurrences = 0;
        String replacedLine = "";
        for( int pos = 0 ; pos < line.length() ; pos++ ){

            if( charToReplace == line.charAt(pos) ){
                replacedLine = replacedLine + replacingChar;
                totalOccurrences++;
            }
            else {
                replacedLine = replacedLine + line.charAt(pos);
            }

        }

        // display the line with replaced characters
        System.out.printf("%s", replacedLine);

    }

}
