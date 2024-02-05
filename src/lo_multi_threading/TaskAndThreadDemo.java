package lo_multi_threading;

public class TaskAndThreadDemo {

    public static void main(String ... args) {

        // create tasks
        Runnable taskPrintA = new PrintCharacters('A', 10000);
        Runnable taskPrintB = new PrintCharacters('B', 10000);

        // create threads
        Thread threadA = new Thread(taskPrintA);
        Thread threadB = new Thread(taskPrintB);

        // execute/start the threads
        threadA.start();
        threadB.start();

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
