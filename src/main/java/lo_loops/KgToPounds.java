package lo_loops;

public class KgToPounds {

    public static void main(String []args) {

        int kg ;

        // start value
        kg = 1;

        // check condition
        while ( kg <= 199 ) {

            System.out.printf("%3d : %5.1f\n", kg, kg*2.2);

            // change value
            kg += 2;
        }

    }

}
