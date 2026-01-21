class throwDemo {
    void number(int n) {
        if(n<0) {
            throw new ArithmeticException("Number cannot be negative");
        } else System.out.println("Number = "+ n);
    }
}

class InvalidBalanceException extends Exception{
    InvalidBalanceException(String msg) {
        super(msg);
    }
}

class InvalidBalanceExceptionDemo {
    void balance(double bal) throws InvalidBalanceException {
        if(bal<0) {
            throw new InvalidBalanceException("Balance cannot be less than 0");
        } else System.out.println("Balance = "+ bal);
    }
}

public class customExceptions {
    public static void main(String[] args) {
        throwDemo t1 = new throwDemo();
        try {
            t1.number(10);
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        InvalidBalanceExceptionDemo i1 = new InvalidBalanceExceptionDemo();
        try {
            i1.balance(20000);
        } catch(InvalidBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
