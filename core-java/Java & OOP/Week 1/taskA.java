import java.util.*;
public class taskA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(n>0) {
            System.out.println("Number is positive");
            for(int i=1; i<=n; i++) {
                System.out.println(i);
            }
        } else if(n<0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is Zero");
        }

    }
}
