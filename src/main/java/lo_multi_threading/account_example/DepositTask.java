package lo_multi_threading.account_example;

public class DepositTask implements Runnable {

    private final Account accountToDepositTo;
    private final double amountToDeposit;

    public DepositTask(Account accountToDepositTo, double amountToDeposit) {
        this.accountToDepositTo = accountToDepositTo;
        this.amountToDeposit = amountToDeposit;
    }

    @Override
    public void run() {
        accountToDepositTo.deposit(amountToDeposit);

//        synchronized (accountToDepositTo){
//            accountToDepositTo.depositV2(amountToDeposit);
//        }

//        accountToDepositTo.depositV3(amountToDeposit);
    }
}
