package lo_multi_threading;

public class CustomThread extends Thread {

    private final String threadName;

    public CustomThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void start() {
        super.start();
        System.out.println( threadName + " : Started");
    }

    @Override
    public void run() {
        super.run();
        System.out.println(threadName + " : Running");
    }
}
