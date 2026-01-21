public class multi_catch {
    public static void main(String[] args) {
        try {
            int i = 10/0;
            System.out.println(i);
        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        } catch(Exception e) {
            System.out.println("General Exception");
        }

        try {
            int i = 10/0;
            System.out.println(i);
        } catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Multi catch exception");
        }
    }
}
