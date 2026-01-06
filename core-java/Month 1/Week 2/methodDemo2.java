public class methodDemo2 {

    public static int add(int a, int b) {
        return a+b;
    }

    public static boolean isAdult(int age) {
        if(age >= 18) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        int sum = add(10, 20);
        System.out.println("Sum = "+ sum);
        boolean isAdult = isAdult(10);
        System.out.println("isAdult : "+isAdult); 
    }
}
