class InvalidMathException extends Exception {
    InvalidMathException(String msg) {
        super(msg);
    }
}

public class exceptionPropogation {

    void demoo() throws InvalidMathException {
        int i = -1;
        if (i < 0) {
            throw new InvalidMathException("Can't be negative");
        }
        System.out.println(i);
    }

    void m2() throws InvalidMathException {
        demoo();
    }

    public static void main(String[] args) {
        exceptionPropogation e1 = new exceptionPropogation();
        try {
            e1.m2();
        } catch(InvalidMathException e) {
            System.out.println(e.getMessage());
        }
    } 
}