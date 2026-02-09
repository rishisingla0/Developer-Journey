class Account {
    int balance = 1000;

    synchronized void withdraw(int amount) {
        balance = balance-amount;
    }
}

class WithdrawTask implements Runnable {
    Account account;

    WithdrawTask(Account account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(500);
        System.out.println(Thread.currentThread().getName() + " | Balance: " + account.balance);
    }
}
public class RaceCondition {
    public static void main(String[] args) {

        Account acc = new Account();

        Thread t1 = new Thread(new WithdrawTask(acc), "Thread-A");
        Thread t2 = new Thread(new WithdrawTask(acc), "Thread-B");

        t1.start();
        t2.start();
    }
}
