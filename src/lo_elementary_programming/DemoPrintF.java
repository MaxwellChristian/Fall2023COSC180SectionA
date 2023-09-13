package lo_elementary_programming;

public class DemoPrintF {

    public static void main(String []args){

        // display value of Math.PI
        System.out.println("Value of Math.PI : " + Math.PI);

        // displaying the same using printf
        // the \n represents a new line
        System.out.printf("Value of Math.PI : %f\n", Math.PI);

        // output needed as following
        // Value 3.14 represents PI
        System.out.printf("Value %f represents PI\n", Math.PI);

        // output of above message with value having only 4 decimals
        System.out.printf("Value %.4f represents PI\n", Math.PI);

        double area = Math.PI * 1.25 * 1.25;
        // output required : Area of circle with radius 1.25 is ----
        System.out.printf("Area of circle with radius %.2f is %.4f\n", 1.25, area);

    }

}
