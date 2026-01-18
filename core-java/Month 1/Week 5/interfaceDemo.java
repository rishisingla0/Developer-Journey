interface Payment {
    void pay();
}

class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("Payment done");
    }
}

class UPIPayment implements Payment {
    public void pay() {
        System.out.println("Payment done from UPI");
    }
}

public class interfaceDemo {
    public static void main(String[] args) {
        Payment p = new CreditCardPayment();
        p.pay();
        Payment p2 = new UPIPayment();
        p2.pay();
    }
}
