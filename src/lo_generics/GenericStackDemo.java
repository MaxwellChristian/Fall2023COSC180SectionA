package lo_generics;

import java.util.Date;

public class GenericStackDemo {

    public static void main(String[] args) {

        GenericStack<Integer> iStack = new GenericStack<>();
        GenericStack<String> sStack = new GenericStack<>();

        iStack.push(19);
//         iStack.push("20"); // not allowed

        sStack.push("Welcome");

        //        sStack.push(20);  // not allowed
        sStack.push(String.valueOf(20));

        // sStack.push(new Date());    // not allowed
        sStack.push(new Date().toString());

    }

}
