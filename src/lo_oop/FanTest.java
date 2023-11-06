package lo_oop;

public class FanTest {

//    private static final int SPEED_MAX = 3;

    public static void main(String []args){

        Fan f1 = new Fan() ;
//        f1.setOn(true);
        f1.turnOn();
        f1.setRadius(10);
        f1.setColor("Yellow");

//        f1.setSpeed(3);
//        f1.setSpeed(SPEED_MAX);
        f1.setSpeed(Fan.FAST);

        Fan f2 = new Fan() ;
//        f2.setOn(false);
//        f2.turnOff();
//        f2.setRadius(5);
//        f2.setColor("blue");
        f2.setSpeed(Fan.MEDIUM);

        System.out.println("Fan 1: " + f1);
        System.out.println("Fan 2: " + f2);

        System.out.println(f2);

        String str = String.valueOf(f1);
        String str2 = f1.toString();
        System.out.println(str);

    }

}
