package lo_methods;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String []args) {

        String text = "Welcome to JAVA. JAVA is fun when practiced.";

        StringTokenizer tokenizer = new StringTokenizer(text);

        int totalTokens = tokenizer.countTokens();
        System.out.println("Total tokens [as per default delimiter]: " + totalTokens);

        System.out.println("Tokens: ");
        while (tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }

        System.out.println("Tokens: ");
        text = "1,Maxwell,Christian,CST";
        tokenizer = new StringTokenizer(text);
        while (tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken(","));
        }

    }

}
