package lo_recursion;

/*
 * Write a recursive method which can return true if the provided string is palindrome
 * */

public class Palindrome {

    public static void main(String[] args) {

        for (String word : args) {
            System.out.println(word + " : Palindrome : " + isPalindrome(word));
        }

    }

    private static boolean isPalindrome(String word) {

        if (word.length() <= 1) {
            return true;
        } else {
            if (word.charAt(0) != word.charAt(word.length() - 1)) {
                return false;
            } else {
                return isPalindrome(word.substring(1, word.length()-1));
            }
        }

    }

}
