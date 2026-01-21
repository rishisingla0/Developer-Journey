interface Payment {
    void pay();
    default void paymentStatus() {
        System.out.println("Pending");
    }
}

interface Refundable {
    default void paymentStatus() {
        System.out.println("Refund");
    }
}

class OnlinePayment implements Payment, Refundable {
    public void pay() {
        System.out.println("Pay");
    }
    public void paymentStatus() {
        Payment.super.paymentStatus();
    }
}

abstract class User {
    String name;
    User(String name) {
        this.name = name;
    }
    abstract void getRole();
}

class Customer extends User {
    Customer(String name) {
        super(name);
    }
    public void getRole() {
        System.out.println("Customer");
    }
}

public class onlinePaymentSystem {
    public static void main(String[] args) {
        User c1 = new Customer("Rishi");
        c1.getRole();
    }
}
