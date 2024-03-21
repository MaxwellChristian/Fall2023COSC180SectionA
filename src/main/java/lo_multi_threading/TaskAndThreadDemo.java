package lo_multi_threading;

public class TaskAndThreadDemo {

    public static void main(String... args) {

        // create tasks
        Runnable taskPrintA = new PrintCharacters('A', 10000);
        Runnable taskPrintB = new PrintCharacters('B', 10000);
        Runnable taskPrintNums = new Runnable() {
            @Override
            public void run() {
                int count = 0;
                while (count++ < 10000) {
                    System.out.print(count);
                }
            }
        };

        // create threads
        Thread threadA = new Thread(taskPrintA);
        Thread threadB = new Thread(taskPrintB);
        Thread threadC = new Thread(taskPrintNums);

        System.out.println("test_.Main: Starting threads");
        long startTime = System.currentTimeMillis();

        // execute/start the threads
        threadA.start();
        threadB.start();
        threadC.start();

        long endTime = System.currentTimeMillis();
        System.out.println("test_.Main: After all threads");

        System.out.println("test_.Main: Time consumed: " + (endTime - startTime));

    }

    static class PrintCharacters implements Runnable {

        char charToPrint;
        int times;

        public PrintCharacters(char charToPrint, int times) {
            this.charToPrint = charToPrint;
            this.times = times;
        }

        @Override
        public void run() {
            int count = 0;
            while (count++ < times) {
                System.out.print(charToPrint);
            }
        }
    }

}
