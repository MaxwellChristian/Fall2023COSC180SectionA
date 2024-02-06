package lo_multi_threading.account_example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

    private double balance = 0;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        double newBalance = this.balance + amount;

        // an intentional delay to demonstrate the problem
        // [when used in un-synchronized way]
        try {
            Thread.sleep(5);
            this.balance = newBalance;
        } catch (InterruptedException exception) {
            System.out.println("Deposit interrupted");
        }
    }
}
