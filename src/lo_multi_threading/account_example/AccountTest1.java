package lo_multi_threading.account_example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountTest1 {

    // Account to deposit
    static Account account = new Account();

    public static void main(String ... args) {

        ExecutorService executorService = Executors.newCachedThreadPool();

        // create and execute deposits
        for (int count = 1 ; count <= 10 ; count++) {
            executorService.execute(new DepositTask(account, 10));
        }

        // shut down the executor
        executorService.shutdown();

        // wait while all tasks are completed
        while (!executorService.isTerminated()) {}

        // display the final balance in the account
        System.out.println("Balance: " + account.getBalance());

    }

}
