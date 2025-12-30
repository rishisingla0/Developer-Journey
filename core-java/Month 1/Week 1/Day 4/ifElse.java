import java.util.*;
public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        if(age < 13) {
            System.out.println("Child");
        } else if(age>=13 && age<20) {
            System.out.println("Teen");
        } else System.out.println("Adult");
    }
}