import java.util.*;
public class arrayInput {
    public static void input(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Array = ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void sum(int arr[]) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum = "+sum);
    }

    public static void largestNumber(int arr[]) {
        int largest = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest = "+largest);
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        input(arr);
        sum(arr);
        largestNumber(arr);

    }
}
