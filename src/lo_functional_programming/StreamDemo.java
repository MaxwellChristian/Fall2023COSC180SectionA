package lo_functional_programming;

import jdk.jshell.EvalException;

import java.util.Arrays;

public class StreamDemo {

    public static void main(String[] args) {

        String[] words = {"Hello", "World", "How", "are", "You", "How", "are", "you", "all", "today"};

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
        System.out.println("Largest word with length >= 4: " + Arrays.stream(words).filter(s -> s.length() >= 4).max(String::compareTo).get());

        // get the smallest word alphabetically
        System.out.println("Smallest word [alphabetically]: " + Arrays.stream(words).min(String::compareTo).get());

        // find if the word 'today' exists
        // System.out.println("Exists 'today': " + Arrays.stream(words).anyMatch(s -> s.equals("today")));
        // System.out.println("Exists 'today': " + Arrays.asList(words).contains("today"));

        System.out.println("Exists 'today': " + Arrays.stream(words).anyMatch(s -> s.equalsIgnoreCase("today")));

        // display all words starting with a capital character
        System.out.println("All words starting with capital character: " + Arrays.stream(words).filter(s -> Character.isUpperCase(s.charAt(0))).toList());

        // check if all words start with a capital character
        System.out.println("All words starting with capital character: " + Arrays.stream(words).allMatch(s -> Character.isUpperCase(s.charAt(0))));

        // display words which does not start with 'ho'
        System.out.println("Words not starting with 'ho': " + Arrays.stream(words).filter(s -> !s.toLowerCase().startsWith("ho")).toList());
        System.out.println("Words not starting with 'ho': " + Arrays.stream(words).noneMatch(s -> s.startsWith("ho")));

        // display all words starting with a capital character [sorted alphabetically]
        // display the word with its length
        System.out.println("All words starting with capital character: ");
        Arrays.stream(words)
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .sorted()
                .distinct()
                .forEach(s -> System.out.printf("%s(%d)\n", s, s.length()));

        // display the first word [in lower-case]
        System.out.println("First word [in lower case]: " + Arrays
                .stream(words)
                .map(String::toLowerCase)
                .findFirst()
                .get()
        );

        // display the first lower-case word
        System.out.println("First lower case word: " + Arrays
                .stream(words)
                .filter(s -> s.equals(s.toLowerCase()))
                .findFirst()
                .get()
        );
    }

}
