import java.util.*;
public class switchh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of operation to be performed: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        int n = sc.nextInt();
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        switch(n) {
            case 1 : System.out.println("a + b = " + (a+b));
            break;
            case 2 : System.out.println("a - b = "+ (a-b));
            break;
            case 3 : System.out.println("a * b = "+ (a*b));
            break;
            case 4 : System.out.println("a / b = "+ (a/b));
            break;
            default : System.out.println("Wrong input");
        }
    }
}
