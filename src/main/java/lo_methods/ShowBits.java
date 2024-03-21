package lo_methods;

public class ShowBits {

    public static void main(String []args) {

        final int MAX_BITS_TO_SHOW = 16;
        int num;

        num = 185;

        showBits(185, MAX_BITS_TO_SHOW);
        System.out.println();

        System.out.println( "Binary of " + num + " : " + Integer.toBinaryString(num) );
        System.out.println( "Hexadecimal of " + num + " : " + Integer.toHexString(num).toUpperCase() );

    }

    private static void showBits(int num, int maxBitsToShow) {

        for( int mask = 1 << (maxBitsToShow-1) ; mask > 0 ; mask >>= 1 ){
            System.out.print( ((num&mask) != 0) ? "1" : "0" );
        }

    }

}
