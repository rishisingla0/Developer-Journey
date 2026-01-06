public class methodOverloading {
    public static int add(int a, int b) {
        return a+b;
    }
    public static double add(double a, double b) {
        return a+b;
    }
    public static void main(String[] args) {
        int sum = add(10, 20);
        double sum2 = add(10.5, 23);
        System.out.println("Sum = "+sum);
        System.out.println("Sum2 = "+sum2);
    }
}