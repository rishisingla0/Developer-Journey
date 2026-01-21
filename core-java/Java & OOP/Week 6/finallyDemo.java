public class finallyDemo {
    public static void main(String[] args) {
        try {
            int a = 10/0;
            System.out.println(a);
        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        } finally {
            System.out.println("Always Executed");
        }
    }
}
