package lo_oop;

public class TV {

    private static final int MAX_VOLUME = 100;  // shared across all objects
    int channel;    // instance variables   -> local copy for each instance/object
    int volumeLevel;
    boolean on;

    private static int totalTVsCreated;

    public static int getTotalTVsCreated() {
        return totalTVsCreated;
    }

    @Override
    public String toString() {

        if( on ){
            return "TV{" +
                    "channel=" + channel +
                    ", volumeLevel=" + volumeLevel +
//                    ", on=" + on +
                    '}';
        } else {
            return "TV {OFF}";
        }

    }

    public TV() {
        on = false;
        volumeLevel = 0;
        channel = 1;
        totalTVsCreated++;
    }

    public TV(boolean on) {
        this(1, 0, on);
        // this() is used to invoke another constructor from a constructor
        // it MUST be the first statement in a constructor
    }

    public TV(int volumeLevel) {
        this(1, volumeLevel, true);
//        this.volumeLevel = volumeLevel;
    }

    public TV(int channel, int volumeLevel) {
        this(channel, volumeLevel, true);
//        this.channel = channel;
//        this.volumeLevel = volumeLevel;
    }

    public TV(int channel, int volumeLevel, boolean on) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;

        totalTVsCreated++;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if( on ){
            this.channel = newChannel;
        }
    }

    public void setVolume(int newVolumeLevel) {
        if( on && newVolumeLevel >= 1 && newVolumeLevel <= MAX_VOLUME ){
            this.volumeLevel = newVolumeLevel;
        }
    }

    public void channelUp(){
        this.channel++;
    }

    public void channelDown(){
        this.channel--;
    }

    public void volumeUp(){
        if( on && volumeLevel < MAX_VOLUME ){
            this.volumeLevel++;
        }
    }

    public void volumeDown(){
        if( on && volumeLevel > 1 ){
            this.volumeLevel--;
        }
    }

}
