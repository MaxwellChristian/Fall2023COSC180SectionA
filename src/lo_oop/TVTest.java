package lo_oop;

public class TVTest {

    public static void main(String []args) {

        TV tv1 ;

        tv1 = new TV();
        tv1.setVolume(15);
        tv1.setChannel(10);
        System.out.println( tv1 );

        System.out.println(tv1.volumeLevel);
        System.out.println(tv1.channel);

        tv1 = new TV();
        tv1.turnOn();
        tv1.setVolume(15);
        tv1.setChannel(10);

        System.out.println("Volume: " + tv1.volumeLevel);
        System.out.println("Channel: " + tv1.channel);

        tv1.setVolume(1500);
        System.out.println("Volume: " + tv1.volumeLevel);


        // Display the values of the tv object
        // Be careful to display only when the tv is ON
        // if tv is off, display a message "TV is OFF"

        System.out.println( tv1 );

        // display total TVs created
        // System.out.println( TV.totalTVsCreated );
        System.out.println( "Total TVs created: " + TV.getTotalTVsCreated() );

        TV tv2 = new TV(true);  // create a TV which is ON
        TV tv3 = new TV(1, 7);  // create a TV which is ON and volume level at 7
        TV tv4 = new TV(52, 7, true);  // create a TV which is ON, volume level at 7 and channel set to 52

    }

}
