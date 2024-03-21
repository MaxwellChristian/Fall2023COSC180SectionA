package lo_recursion;

public class VowelCount {
    public static void main(String[] args) {


//        System.out.println(args[0] + " has vowels : " + countVowels(args[0]));
//        System.out.println(args[0] + " has vowels : " + countVowelsR(args[0], 0));
        System.out.println(args[0] + " has vowels : " + countVowelsR2(args[0]));

    }

    private static int countVowels(String word) {

        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                case 'y':
                case 'Y':
                    counter++;
            }
        }

        return counter;
    }

    private static int countVowelsR(String word, int index) {

        if( index >= word.length() ){
            return 0;
        }

        int counter = 0;
        switch (word.charAt(index)) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
            case 'y':
            case 'Y':
                counter = 1;
        }

        return counter + countVowelsR(word, index+1);

    }

    private static int countVowelsR2(String word) {

        if(word.isEmpty()){
            return 0;
        }

        int counter = 0;
        switch (word.charAt(0)) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                counter = 1;
        }

        return counter + countVowelsR2(word.substring(1));

    }
}
