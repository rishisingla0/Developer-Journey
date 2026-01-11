class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    static String bankName = "State Bank of India";
    
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    int getNumber() {
        return accountNumber;
    }
    String getName() {
        return accountHolder;
    }
    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful of amount "+ amount);
    }
    void withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw Successful of amount "+ amount);
        } else {
            System.out.println("Cannot withdraw "+ amount +" Low Account Balance " + getBalance());
        }
    }
}

public class bankAccountSystem {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1002, "RISHI", 42800);
        b1.deposit(50000);
        b1.withdraw(130000);
        System.out.println("Balance = "+ b1.getBalance());
    }
}
