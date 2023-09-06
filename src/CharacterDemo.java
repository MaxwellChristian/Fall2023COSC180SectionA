/*
This program demonstrates the use of char data type
 */
public class CharacterDemo {

    public static void main(String []args){

        // declaration section
        char ch;    // this is a variable of type char
        // it can hold ONLY a SINGLE character

        int num;    // an int variable to store whole number

        // input section
        ch = 'A';

        // processing section
        num = ch;

        // output section
        System.out.println("The variable ch has  : " + ch);
        System.out.println("The variable num has : " + num);

        // ch = 'a';
        // num = ch ;
        num = ch = 'a';     // a multi-assignment statement
        // similar to above-mentioned two individual assignment statements
        System.out.println("The variable ch has  : " + ch);
        System.out.println("The variable num has : " + num);

        // ch = 'Z';
        // num = ch ;
        num = ch = 'Z';     // a multi-assignment statement
        // similar to above-mentioned two individual assignment statements
        System.out.println("The variable ch has  : " + ch);
        System.out.println("The variable num has : " + num);

        // ch = 'z';
        // num = ch ;
        num = ch = 'z';     // a multi-assignment statement
        // similar to above-mentioned two individual assignment statements
        System.out.println("The variable ch has  : " + ch);
        System.out.println("The variable num has : " + num);

    }

}
