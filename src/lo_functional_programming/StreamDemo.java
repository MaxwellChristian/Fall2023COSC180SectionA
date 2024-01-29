package lo_functional_programming;

import jdk.jshell.EvalException;

import java.util.Arrays;

public class StreamDemo {

    public static void main(String []args) {

        String []words = { "Hello", "World", "How", "are", "You", "How", "are", "you", "all", "today" } ;

        // display first 4 words
        System.out.println("First 4 words: " + Arrays.stream(words).limit(4).toList());

        // display first 4 words in sorted order
        System.out.println("First 4 words [sorted]: " + Arrays.stream(words).limit(4).sorted().toList());

        // display the names in sorted order, ignoring the case and skipping the first 2 elements
        // System.out.println("First 4 words: " + Arrays.stream(words).skip(2).sorted().toList());
        // System.out.println("First 4 words: " + Arrays.stream(words).skip(2).sorted((o1, o2) -> o1.compareToIgnoreCase(o2)).toList());
        System.out.println("Skipped 2 words [sorted]: " + Arrays.stream(words).skip(2).sorted(String::compareToIgnoreCase).toList());

        // distinct words
        System.out.println("Distinct words: " + Arrays.stream(words).distinct().toList());

        // fetch words with length >= 4
        System.out.println("Words [length>=4]: " + Arrays.stream(words).filter(s -> s.length() >= 4).toList());

        // get the word with largest length from all words with length >= 4

        // get the smallest word alphabetically

        // find if the word 'today' exists

        // display all names starting with a capital character

        // display words which does not start with 'ho'
    }

}
