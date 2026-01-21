class InsufficientBalanceException extends RuntimeException {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class BankAccount {
    double balance;
    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if(amount > balance) {
            System.out.println("Withdraw amount = "+amount);
            System.out.println("Balance = "+balance);
            throw new InsufficientBalanceException("Withdraw amount is greater than balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdraw Successful");
            System.out.println("Balance = "+balance);
        }
    }

    void processWithdrawl(double amount) throws InsufficientBalanceException {
        withdraw(amount);
    }
}

public class bankAccountValidationSystem {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(42800);
        try {
            b1.processWithdrawl(50000);
        } catch(InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction Completed");
        }
    }
}
