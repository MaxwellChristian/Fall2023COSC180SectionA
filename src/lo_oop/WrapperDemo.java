package lo_oop;

public class WrapperDemo {

    public static void main(String []args) {

        int x = 87;

        // Integer iObj = new Integer(57);
        Integer iObj = 57;  // boxing/wrapping

        int i = iObj;   // unboxing/unwrapping
        // i = iObj.intValue();   // unboxing/unwrapping

        float f = iObj.floatValue();
        double d = iObj.doubleValue();
        String s = iObj.toString();
        byte b = iObj.byteValue();

        System.out.println("int value : " + i);
        System.out.println("float value : " + f);
        System.out.println("double value : " + d);
        System.out.println("byte value : " + b);
        System.out.println("String value : " + s);

        Float fObj = 57.87f;
        Double dObj = 89798.2479382;
        Boolean blObj = true;

        Character cObj = 'A';


    }

}
