package lo_multi_threading;

public class CustomThreadDemo {

    public static void main(String... args) {

        CustomThread c1 = new CustomThread("C1");
        CustomThread c2 = new CustomThread("C2");
        CustomThread c3 = new CustomThread("C3");

        c1.start();
        c2.start();
        c3.start();

    }

}
