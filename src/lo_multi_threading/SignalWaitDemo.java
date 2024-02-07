package lo_multi_threading;

import lo_multi_threading.account_example.Account;
import lo_multi_threading.account_example.DepositTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SignalWaitDemo {

    private static Account account = new Account();

    public static void main(String ... args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(new DepositTask(account));
        executorService.execute(new WithdrawTask(account));

        executorService.shutdown();

    }

    public static class Account {

        private static final Lock lock = new ReentrantLock();

        private static Condition newDeposit = lock.newCondition();

        private double balance = 0;

        public double getBalance() {
            return balance;
        }

        public void withdraw(int amount){
            lock.lock();
            try {
                while (balance < amount) {
                    System.out.println("Wait for deposit");
                    newDeposit.await();
                }

                balance -= amount;
                System.out.println("Withdraw: " + amount + ", Balance: " + getBalance());
            } catch (InterruptedException exception){
                System.out.println(exception.getMessage());
            } finally {
                lock.unlock();
            }
        }

        public synchronized void deposit(double amount) {

            lock.lock();

            try {
                this.balance += amount;
                System.out.println("Deposit: " + amount + ", Balance: " + getBalance());

                newDeposit.signalAll();
            } finally {
                lock.unlock();
            }
        }

    }

    private static class WithdrawTask implements Runnable {
        public WithdrawTask(Account account) {
        }

        @Override
        public void run() {
            while (true){
                account.withdraw((int)(Math.random()*10)+1);
            }
        }
    }
}
