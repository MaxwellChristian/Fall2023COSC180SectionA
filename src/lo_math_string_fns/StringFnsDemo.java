package lo_math_string_fns;

public class StringFnsDemo {

    public static void main(String []args){

        String name = "My name is Maxwell Christian";

        System.out.println("Length : " + name.length() );

        // ame = "78.6875"; allowed
        // name = "8"; // allowed
        // name = '8'; // not allowed

        System.out.println("Lower case : " + name.toLowerCase() );
        System.out.println("Upper case : " + name.toUpperCase() );

        System.out.println("1st character : " + name.charAt(0));
        System.out.println("2nd character : " + name.charAt(1));
        System.out.println("Last character : " + name.charAt( name.length() - 1 ));

        // System.out.println("22nd character : " + name.charAt(22));
        // this will throw an exception as the number passed is more than the length

        System.out.println("index of 'a' : " + name.indexOf('a'));
        // returns the index of first occurrence of 'a' in the string

        System.out.println("last index of 'a' : " + name.lastIndexOf('a'));
        // returns the index of last occurrence of 'a' in the string

        System.out.println("index of 'j' : " + name.lastIndexOf('j'));
        // returns the index of last occurrence of 'j' in the string

        int firstOccurrenceOfA = name.indexOf('a');
        System.out.println("index of second 'a' : " + name.indexOf('a', firstOccurrenceOfA + 1) );
        // returns the index of second occurrence of 'a' in the string

        // extract part of a string
        System.out.println("First two characters: " + name.substring(0, 7));
        // starts from FIRST_INDEX up to LAST_INDEX [i.e. last index - 1]

        // another substring
        System.out.println("First two characters: " + name.substring(3));
        // returns all characters from index 3 onwards

        // display the second word from the string

        // display the last word from the string

    }

}
