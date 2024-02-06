package lo_multi_threading;

public class CustomThreadDemo3 {

    public static void main(String ... args) {

        System.out.println("Main: Before all threads");

        CustomThread2 cThread1 = new CustomThread2("C1", 100, 1000);
        CustomThread2 cThread2 = new CustomThread2("C2", 50, 2000);
        CustomThread2 cThread3 = new CustomThread2("C3", 10, 3000);

        System.out.println("Main: After all threads created");
        System.out.println("Main: Before all threads started");

        cThread1.start();
        cThread2.start();
        cThread3.start();

        // wait for all threads to complete
        // so main should join to all threads
        try {
            // wait for thread 1
            cThread1.join();

            // wait for thread 2
            cThread2.join();

            // wait for thread 3
            cThread3.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main: After all threads completed");

    }

}
