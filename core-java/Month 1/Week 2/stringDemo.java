import java.util.*;
public class stringDemo {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = new String("Hello");
        System.out.println("Length = "+str.length());
        System.out.println("First Character = "+str.charAt(0));
        System.out.println("Last Character = "+str.charAt(str.length()-1));
        System.out.println(str == str2);
        System.out.println(str.equals(str2));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str3 = sc.nextLine();
        System.out.println("String = "+str3);
        System.out.println("str3 in uppercase = "+str3.toUpperCase());
        System.out.println("str3 in lowercase = "+str3.toLowerCase());
    }
}
