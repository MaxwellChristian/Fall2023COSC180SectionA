package lo_oop;

public class TV {

    private static final int MAX_VOLUME = 100;  // shared across all objects
    int channel;    // instance variables   -> local copy for each instance/object
    int volumeLevel;
    boolean on;

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
