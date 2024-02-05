package lo_multi_threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static void main(String []args) {

        // a pool of threads [with maximum three threads]
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // provide the runnable task to the executor
        executorService.execute(new CustomThread("Th1"));
        executorService.execute(new CustomThread("Th2"));
        executorService.execute(new CustomThread("Th3"));

        // close/shutdown the executor service
        executorService.shutdown();

    }

}
